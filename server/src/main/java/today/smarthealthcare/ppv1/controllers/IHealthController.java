package today.smarthealthcare.ppv1.controllers;

import today.smarthealthcare.ppv1.dto.classifier.CommonClassifierCodes;
import today.smarthealthcare.ppv1.ihealth.client.IHealthClient;
import today.smarthealthcare.ppv1.ihealth.dto.*;
import today.smarthealthcare.ppv1.ihealth.dto.data.IHealthBoDataDto;
import today.smarthealthcare.ppv1.ihealth.dto.data.IHealthBpDataDto;
import today.smarthealthcare.ppv1.ihealth.dto.data.IHealthWeightDataDto;
import today.smarthealthcare.ppv1.persistence.model.classifier.MeasurementClassifier;
import today.smarthealthcare.ppv1.persistence.model.patient.Patient;
import today.smarthealthcare.ppv1.persistence.model.patient.PatientMeasurement;
import today.smarthealthcare.ppv1.persistence.service.IPatientPersistenceService;
import today.smarthealthcare.ppv1.persistence.service.impl.ClassifierPersistenceService;
import com.google.common.collect.Lists;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Controller responsible for communication with IHealth
 *
 * @author: Vadim Nesmashnov
 */
@Controller
public class IHealthController {
    private final static Logger LOGGER = LoggerFactory.getLogger(IHealthController.class);
    @Autowired
    private IHealthClient iHealthClient;
    @Autowired
    private ClassifierPersistenceService classifierPersistenceService;
    @Autowired
    private IPatientPersistenceService patientPersistenceService;

    @RequestMapping(value = "/ihealth/authorizationUrl", method = RequestMethod.POST)
    @ResponseBody
    public AuthUrlDto getAuthorizationUrlString(@RequestParam Long patientId) {

        return new AuthUrlDto(iHealthClient.buildAuthorizationUrl(patientId));
    }

    @RequestMapping(value = "/ihealth/redirect_for_code", method = RequestMethod.GET)
    @ResponseStatus(HttpStatus.OK)
    public ModelAndView handleIHealthCodeResponse(@RequestParam String code, @RequestParam Long id) {
        IHealthAccessTokenResponseDto accessTokenResponseDto = iHealthClient.retrieveAccessToken(code);

        LOGGER.debug("IHEALTH_D " + accessTokenResponseDto);

        ModelAndView errorView = checkForErrors(accessTokenResponseDto);
        if (errorView != null) {
            return errorView;
        }

        IHealthUserBpDataResponseDto bpDataFirstPage = iHealthClient.retrieveUserBpData(accessTokenResponseDto.getUserID(), accessTokenResponseDto.getAccessToken());

        List<IHealthUserBpDataResponseDto> userBpData = Lists.newArrayList(bpDataFirstPage);
        String nextPageUrl = bpDataFirstPage.getNextPageUrl();
        while (StringUtils.isNotEmpty(nextPageUrl)) {
            IHealthUserBpDataResponseDto currentPage = iHealthClient.retrieveBpDataByUrl(nextPageUrl);
            nextPageUrl = currentPage.getNextPageUrl();
            userBpData.add(currentPage);
        }

        errorView = checkForErrors(userBpData.toArray(new IHealthResponseDto[userBpData.size()]));

        if (errorView != null) {
            return errorView;
        }

        IHealthUserBoDataResponseDto boDataFirstPage = iHealthClient.retrieveUserBoData(accessTokenResponseDto.getUserID(), accessTokenResponseDto.getAccessToken());

        List<IHealthUserBoDataResponseDto> userBoData = Lists.newArrayList(boDataFirstPage);
        nextPageUrl = boDataFirstPage.getNextPageUrl();
        while (StringUtils.isNotEmpty(nextPageUrl)) {
            IHealthUserBoDataResponseDto currentPage = iHealthClient.retrieveBoDataByUrl(nextPageUrl);
            nextPageUrl = currentPage.getNextPageUrl();
            userBoData.add(currentPage);
        }

        errorView = checkForErrors(userBoData.toArray(new IHealthResponseDto[userBoData.size()]));

        if (errorView != null) {
            return errorView;
        }

        IHealthUserWeightDataResponseDto weightDataFirstPage = iHealthClient.retrieveUserWeightData(accessTokenResponseDto.getUserID(), accessTokenResponseDto.getAccessToken());

        List<IHealthUserWeightDataResponseDto> userWeightData = Lists.newArrayList(weightDataFirstPage);
        nextPageUrl = weightDataFirstPage.getNextPageUrl();
        while (StringUtils.isNotEmpty(nextPageUrl)) {
            IHealthUserWeightDataResponseDto currentPage = iHealthClient.retrieveWeightDataByUrl(nextPageUrl);
            nextPageUrl = currentPage.getNextPageUrl();
            userWeightData.add(currentPage);
        }

        errorView = checkForErrors(userWeightData.toArray(new IHealthResponseDto[userWeightData.size()]));

        if (errorView != null) {
            return errorView;
        }

        Patient patient = patientPersistenceService.getPatientById(id);
        MeasurementClassifier diastolicBPClassifier = classifierPersistenceService.getMeasurementClassifierByCode(CommonClassifierCodes.MEASUREMENT_BLOOD_PRESSURE_DIASTOLIC);
        MeasurementClassifier systolicBPClassifier = classifierPersistenceService.getMeasurementClassifierByCode(CommonClassifierCodes.MEASUREMENT_BLOOD_PRESSURE_SYSTOLIC);
        MeasurementClassifier weightClassifier = classifierPersistenceService.getMeasurementClassifierByCode(CommonClassifierCodes.MEASUREMENT_WEIGHT);
        MeasurementClassifier bloodOxygenClassifier = classifierPersistenceService.getMeasurementClassifierByCode(CommonClassifierCodes.MEASUREMENT_BLOOD_OXYGEN);
        MeasurementClassifier heartRateClassifier = classifierPersistenceService.getMeasurementClassifierByCode(CommonClassifierCodes.MEASUREMENT_HEART_RATE);

        List<PatientMeasurement> measurements = new ArrayList<>();

        for (IHealthUserBpDataResponseDto userBpDataResponseDto : userBpData) {
            for (IHealthBpDataDto data : userBpDataResponseDto.getBpData()) {
                measurements.add(new PatientMeasurement(patient, getDate(data.getMeasurementDate()), systolicBPClassifier, data.getSystolic(), true));
                measurements.add(new PatientMeasurement(patient, getDate(data.getMeasurementDate()), diastolicBPClassifier, data.getDiastolic(), true));
                measurements.add(new PatientMeasurement(patient, getDate(data.getMeasurementDate()), heartRateClassifier, data.getHeartRate(), true));
            }
        }

        for (IHealthUserWeightDataResponseDto userWeightDataResponseDto : userWeightData) {
            for (IHealthWeightDataDto data : userWeightDataResponseDto.getWeightData()) {
                measurements.add(new PatientMeasurement(patient, getDate(data.getMeasurementDate()), weightClassifier, data.getWeightValue(), true));
            }
        }

        for (IHealthUserBoDataResponseDto userBoDataResponseDto : userBoData) {
            for (IHealthBoDataDto data : userBoDataResponseDto.getBoData()) {
                measurements.add(new PatientMeasurement(patient, getDate(data.getMeasurementDate()), bloodOxygenClassifier, data.getBloodOxygen(), true));
            }
        }

        patientPersistenceService.storePatientMeasurements(measurements);

        return new ModelAndView("import_success");
    }

    private Date getDate(Long time) {
        return new Date(time * 1000);
    }

    private ModelAndView checkForErrors(IHealthResponseDto... responses) {
        for (IHealthResponseDto response : responses) {
            if (StringUtils.isNotEmpty(response.getError())) {
                return new ModelAndView("import_error", "response", response);
            }
        }

        return null;
    }

    public class AuthUrlDto {
        private String url;

        public AuthUrlDto(String url) {
            this.url = url;
        }

        public String getUrl() {
            return url;
        }

        public void setUrl(String url) {
            this.url = url;
        }
    }
}
