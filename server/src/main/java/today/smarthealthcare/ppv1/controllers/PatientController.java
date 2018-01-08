package today.smarthealthcare.ppv1.controllers;

import today.smarthealthcare.ppv1.Constants;
import today.smarthealthcare.ppv1.dto.classifier.CommonClassifierCodes;
import today.smarthealthcare.ppv1.dto.healthStatement.HealthStatementDto;
import today.smarthealthcare.ppv1.dto.patient.NotesDto;
import today.smarthealthcare.ppv1.dto.patient.PatientDto;
import today.smarthealthcare.ppv1.dto.patient.PatientMeasurementDto;
import today.smarthealthcare.ppv1.dto.selfHealthCheck.SelfHealthCheckDto;
import today.smarthealthcare.ppv1.dto.user.*;
import today.smarthealthcare.ppv1.dto.util.ResultDto;
import today.smarthealthcare.ppv1.dto.util.SaveResultDto;
import today.smarthealthcare.ppv1.persistence.service.IPatientPersistenceService;
import today.smarthealthcare.ppv1.services.EmailService;
import today.smarthealthcare.ppv1.services.JwtService;
import today.smarthealthcare.ppv1.util.DateFromMillisecondsEditor;
import org.apache.commons.lang3.RandomStringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.*;

import java.text.SimpleDateFormat;
import java.util.*;

import today.smarthealthcare.ppv1.dto.patient.NotesDto;
import today.smarthealthcare.ppv1.dto.patient.PatientDto;

/**
 * Patient controller
 *
 * @author: Vadim Nesmashnov
 */
@RestController
public class PatientController {
    private final static Logger LOGGER = LoggerFactory.getLogger(PatientController.class);
    @Autowired
    private IPatientPersistenceService patientPersistenceService;
    @Autowired
    private JwtService jwtService;
    @Autowired
    private EmailService emailService;

    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public LoginSignUpResultDto login(@RequestBody UserDto user) {
        LoginSignUpResultDto resultDto = new LoginSignUpResultDto();

        PatientDto loadedUser = patientPersistenceService.getPatientDtoByEmail(user.getEmail());

        if (loadedUser != null && loadedUser.getPassword().equals(user.getPassword())) {
            resultDto.setResult(Constants.OPERATION_RESULT_OK);
            resultDto.setToken(jwtService.createAndSignToken(loadedUser));
        } else {
            resultDto.setResult(Constants.OPERATION_RESULT_ERROR);
        }

        return resultDto;
    }

    @RequestMapping(value = "/signup", method = RequestMethod.POST)
    public LoginSignUpResultDto signUp(@RequestBody PatientDto user) {
        LoginSignUpResultDto resultDto = new LoginSignUpResultDto();

        PatientDto existingPatient = patientPersistenceService.getPatientDtoByEmail(user.getEmail());

        if (existingPatient != null) {
            resultDto.setResult("Exists");
        } else {
            user.setRole(UserRole.PATIENT);

            Long userId = patientPersistenceService.storeNewPatient(user);
            user.setId(userId);

            resultDto.setResult(Constants.OPERATION_RESULT_OK);
            resultDto.setToken(jwtService.createAndSignToken(user));
        }

        return resultDto;
    }

    @RequestMapping(value = "/changePassword", method = RequestMethod.POST)
    public ResultDto changePassword(@RequestParam(value = "id") Long id,
                                    @RequestParam(value = "password") String password,
                                    @RequestParam(value = "newPassword") String newPassword) {
        ResultDto resultDto = new ResultDto();

        PatientDto user = patientPersistenceService.getPatientDtoById(id);

        if (user != null && user.getPassword().equals(password)) {
            patientPersistenceService.changePassword(id, newPassword);

            resultDto.setResult(Constants.OPERATION_RESULT_OK);
        } else {

            resultDto.setResult(Constants.OPERATION_RESULT_ERROR);
        }

        return resultDto;
    }

    @RequestMapping(value = "/forgotPassword", method = RequestMethod.POST)
    public ResultDto forgotPassword(@RequestParam(value = "email") String email) {
        ResultDto resultDto = new ResultDto();

        PatientDto user = patientPersistenceService.getPatientDtoByEmail(email);

        if (user != null) {
            String newPassword = RandomStringUtils.random(8, 0, 20, true, true, "qw32rfHIJk9iQ8Ud7h0X".toCharArray());
            patientPersistenceService.changePassword(user.getId(), newPassword);

            if (emailService.sendResetPasswordEmail(email, newPassword)) {
                resultDto.setResult(Constants.OPERATION_RESULT_OK);
            } else {
                resultDto.setResult(Constants.OPERATION_RESULT_ERROR);
            }
        } else {
            resultDto.setResult(Constants.OPERATION_RESULT_ERROR);
        }

        return resultDto;
    }

    @RequestMapping(value = "/customerSupportRequest", method = RequestMethod.POST)
    public void customerSupportRequest(@RequestParam(value = "id") Long id,
                                       @RequestParam(value = "subject") String subject,
                                       @RequestParam(value = "message") String message) {

        PatientDto user = patientPersistenceService.getPatientDtoById(id);

        emailService.sendCustomerSupportRequest(user.getFullName(), subject, message);
    }


    @RequestMapping(value = "/getPatient", method = RequestMethod.POST)
    public PatientDto getPatient(@RequestParam(value = "id") Long id) {

        PatientDto patientDto = patientPersistenceService.getPatientDtoById(id);
        patientDto.setPassword("***");
        patientDto.setConfirmPassword("***");

        return patientDto;
    }

    @RequestMapping(value = "/getPatientBPMeasurements", method = RequestMethod.POST)
    public ChartDataDto getPatientBPMeasurements(@RequestParam(value = "patientId") Long patientId,
                                                 @RequestParam(value = "startDate") Date startDate,
                                                 @RequestParam(value = "endDate") Date endDate,
                                                 @RequestParam(value = "squashDayMeasurements") Boolean squashDayMeasurements) {

        List<PatientMeasurementDto> measurementDtos = patientPersistenceService.getPatientMeasurements(patientId,
                Arrays.asList(CommonClassifierCodes.MEASUREMENT_BLOOD_PRESSURE_DIASTOLIC, CommonClassifierCodes.MEASUREMENT_BLOOD_PRESSURE_SYSTOLIC),
                startDate, endDate);

        Map<String, ChartValueDto> chartValuesMap = new HashMap<>();

        if (squashDayMeasurements) {
            SimpleDateFormat dateFormat = new SimpleDateFormat("yyyyMMdd");
            for (PatientMeasurementDto measurementDto : measurementDtos) {
                ChartValueDto current = chartValuesMap.get(dateFormat.format(measurementDto.getDate()));
                if (current == null) {
                    current = new ChartValueDto(measurementDto.getDate());
                    chartValuesMap.put(String.valueOf(dateFormat.format(measurementDto.getDate())), current);
                }

                Double currentValue = Double.valueOf(measurementDto.getValue());
                if (measurementDto.getClassifier().getCode().equals(CommonClassifierCodes.MEASUREMENT_BLOOD_PRESSURE_DIASTOLIC)) {
                    if (current.getValue1() == null || current.getValue1() < currentValue) {
                        current.setValue1(currentValue);
                    }
                } else {
                    if (current.getValue2() == null || current.getValue2() > currentValue) {
                        current.setValue2(currentValue);
                    }
                }
            }
        } else {
            for (PatientMeasurementDto measurementDto : measurementDtos) {
                ChartValueDto current = chartValuesMap.get(String.valueOf(measurementDto.getDate().getTime()));
                if (current == null) {
                    current = new ChartValueDto(measurementDto.getDate());
                    chartValuesMap.put(String.valueOf(measurementDto.getDate().getTime()), current);
                }

                if (measurementDto.getClassifier().getCode().equals(CommonClassifierCodes.MEASUREMENT_BLOOD_PRESSURE_DIASTOLIC)) {
                    current.setValue1(Double.valueOf(measurementDto.getValue()));
                } else {
                    current.setValue2(Double.valueOf(measurementDto.getValue()));
                }
            }
        }

        List<ChartValueDto> chartValues = new ArrayList<>(chartValuesMap.values());
        Collections.sort(chartValues);

        return new ChartDataDto(chartValues);
    }

    @RequestMapping(value = "/getPatientWeightMeasurements", method = RequestMethod.POST)
    public ChartDataDto getPatientWeightMeasurements(@RequestParam(value = "patientId") Long patientId,
                                                     @RequestParam(value = "startDate") Date startDate,
                                                     @RequestParam(value = "endDate") Date endDate,
                                                     @RequestParam(value = "squashDayMeasurements") Boolean squashDayMeasurements) {

        List<PatientMeasurementDto> measurementDtos = patientPersistenceService.getPatientMeasurements(patientId,
                Arrays.asList(CommonClassifierCodes.MEASUREMENT_WEIGHT), startDate, endDate);

        return getSingleValueChartDataDto(measurementDtos, squashDayMeasurements);
    }

    @RequestMapping(value = "/getPatientBOMeasurements", method = RequestMethod.POST)
    public ChartDataDto getPatientBOMeasurements(@RequestParam(value = "patientId") Long patientId,
                                                 @RequestParam(value = "startDate") Date startDate,
                                                 @RequestParam(value = "endDate") Date endDate,
                                                 @RequestParam(value = "squashDayMeasurements") Boolean squashDayMeasurements) {

        List<PatientMeasurementDto> measurementDtos = patientPersistenceService.getPatientMeasurements(patientId,
                Arrays.asList(CommonClassifierCodes.MEASUREMENT_BLOOD_OXYGEN), startDate, endDate);

        return getSingleValueChartDataDto(measurementDtos, squashDayMeasurements);
    }

    @RequestMapping(value = "/getPatientHRMeasurements", method = RequestMethod.POST)
    public ChartDataDto getPatientHRMeasurements(@RequestParam(value = "patientId") Long patientId,
                                                 @RequestParam(value = "startDate") Date startDate,
                                                 @RequestParam(value = "endDate") Date endDate,
                                                 @RequestParam(value = "squashDayMeasurements") Boolean squashDayMeasurements) {

        List<PatientMeasurementDto> measurementDtos = patientPersistenceService.getPatientMeasurements(patientId,
                Arrays.asList(CommonClassifierCodes.MEASUREMENT_HEART_RATE), startDate, endDate);

        return getSingleValueChartDataDto(measurementDtos, squashDayMeasurements);
    }

    @RequestMapping(value = "/savePatientGeneral", method = RequestMethod.POST)
    public void savePatientGeneral(@RequestBody PatientDto patient) {

        LOGGER.debug("Got patient data {}", patient);

        patientPersistenceService.storePatientGeneralData(patient);
    }

    @RequestMapping(value = "/savePatientMedicalData", method = RequestMethod.POST)
    public void savePatientMedicalData(@RequestBody PatientDto patient) {

        LOGGER.debug("Got patient data {}", patient);

        patientPersistenceService.storePatientMedicalData(patient);
    }

    @RequestMapping(value = "/getPatientHealthStatement", method = RequestMethod.POST)
    public HealthStatementDto getPatientHealthStatement(@RequestParam(value = "patientId") Long patientId) {

        return patientPersistenceService.getPatientHealthStatement(patientId);
    }

    @RequestMapping(value = "/savePatientHealthStatement", method = RequestMethod.POST)
    public SaveResultDto savePatientHealthStatement(@RequestBody HealthStatementDto healthStatement) {
        SaveResultDto result = new SaveResultDto(Constants.OPERATION_RESULT_OK);

        result.setId(patientPersistenceService.storePatientHealthStatement(healthStatement));

        return result;
    }

    @RequestMapping(value = "/getPatientNotes", method = RequestMethod.POST)
    public NotesDto getPatientNotes(@RequestParam(value = "patientId") Long patientId) {

        return patientPersistenceService.getPatientNotes(patientId);
    }

    @RequestMapping(value = "/savePatientNotes", method = RequestMethod.POST)
    public SaveResultDto savePatientNotes(@RequestBody NotesDto notesDto) {
        SaveResultDto result = new SaveResultDto(Constants.OPERATION_RESULT_OK);

        result.setId(patientPersistenceService.storePatientNotes(notesDto));

        return result;
    }

    @RequestMapping(value = "/getPatientSelfHealthCheck", method = RequestMethod.POST)
    public SelfHealthCheckDto getPatientSelfHealthCheck(@RequestParam(value = "id") Long id) {

        return patientPersistenceService.getPatientSelfHealthCheck(id);
    }

    @RequestMapping(value = "/getPatientSelfHealthChecks", method = RequestMethod.POST)
    public List<SelfHealthCheckDto> getPatientSelfHealthChecks(@RequestParam(value = "patientId") Long patientId,
                                                                  @RequestParam(value = "startDate", required = false) Date startDate,
                                                                  @RequestParam(value = "endDate", required = false) Date endDate) {

        return patientPersistenceService.getPatientSelfHealthChecks(patientId, startDate, endDate);
    }

    @RequestMapping(value = "/savePatientSelfHealthCheck", method = RequestMethod.POST)
    public SaveResultDto savePatientSelfHealthCheck(@RequestBody SelfHealthCheckDto selfHealthCheckDto) {
        SaveResultDto result = new SaveResultDto(Constants.OPERATION_RESULT_OK);

        result.setId(patientPersistenceService.storePatientSelfHealthCheck(selfHealthCheckDto));

        return result;
    }

    private ChartDataDto getSingleValueChartDataDto(List<PatientMeasurementDto> measurements, Boolean squashDayMeasurements) {
        List<ChartValueDto> chartValues = new ArrayList<>();

        if (squashDayMeasurements) {
            Map<String, ChartValueDto> chartValuesMap = new HashMap<>();
            SimpleDateFormat dateFormat = new SimpleDateFormat("yyyyMMdd");

            for (PatientMeasurementDto measurement : measurements) {
                Double currentValue = Double.valueOf(measurement.getValue());

                ChartValueDto current = chartValuesMap.get(dateFormat.format(measurement.getDate()));
                if (current == null) {
                    current = new ChartValueDto(measurement.getDate());
                    chartValuesMap.put(dateFormat.format(measurement.getDate()), current);
                }

                if (current.getValue1() == null || current.getValue1() < currentValue) {
                    current.setValue1(currentValue);
                }
            }

            chartValues.addAll(chartValuesMap.values());
        } else {
            for (PatientMeasurementDto measurement : measurements) {
                ChartValueDto chartValueDto = new ChartValueDto(measurement.getDate());
                chartValueDto.setValue1(Double.valueOf(measurement.getValue()));
                chartValues.add(chartValueDto);
            }
        }

        Collections.sort(chartValues);

        return new ChartDataDto(chartValues);
    }

    @InitBinder
    public void bindingPreparation(WebDataBinder binder) {
        binder.registerCustomEditor(Date.class, new DateFromMillisecondsEditor());
    }

    public class ChartDataDto {
        private final List<ChartValueDto> values;

        public ChartDataDto(List<ChartValueDto> values) {
            this.values = values;
        }

        public List<ChartValueDto> getValues() {
            return values;
        }
    }

    public class ChartValueDto implements Comparable<ChartValueDto> {
        private final Date date;
        private Double value1;
        private Double value2;

        public ChartValueDto(Date date) {
            this.date = date;
        }

        public Date getDate() {
            return date;
        }

        public Double getValue1() {
            return value1;
        }

        public Double getValue2() {
            return value2;
        }

        public void setValue1(Double value1) {
            this.value1 = value1;
        }

        public void setValue2(Double value2) {
            this.value2 = value2;
        }

        @Override
        public int compareTo(ChartValueDto o) {
            return this.date.compareTo(o.date);
        }
    }
}
