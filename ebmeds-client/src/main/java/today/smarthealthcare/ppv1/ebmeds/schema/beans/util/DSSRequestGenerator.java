package today.smarthealthcare.ppv1.ebmeds.schema.beans.util;

import today.smarthealthcare.ppv1.dto.patient.*;
import today.smarthealthcare.ppv1.ebmeds.schema.beans.DSSRequest;
import today.smarthealthcare.ppv1.ebmeds.schema.beans.DSSResponse;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.xml.bind.JAXBElement;
import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeConstants;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.namespace.QName;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

import static today.smarthealthcare.ppv1.ebmeds.schema.beans.util.RequestDefaults.*;

import today.smarthealthcare.ppv1.dto.patient.Gender;
import today.smarthealthcare.ppv1.dto.patient.PatientDiagnosisDto;
import today.smarthealthcare.ppv1.dto.patient.PatientDto;
import today.smarthealthcare.ppv1.dto.patient.PatientMeasurementDto;
import today.smarthealthcare.ppv1.dto.patient.PatientMedicationDto;
import today.smarthealthcare.ppv1.ebmeds.schema.beans.DSSRequest;
import today.smarthealthcare.ppv1.ebmeds.schema.beans.DSSResponse;

/**
 * Helper class for generating {@link DSSRequest}
 *
 * @author: Vadim Nesmashnov
 */
public class DSSRequestGenerator {
    private final static Logger LOGGER = LoggerFactory.getLogger(DSSRequestGenerator.class);
    private static final GregorianCalendar gregorianCalendar = new GregorianCalendar();

    /**
     * Generate DSSRequest fromm given patient data
     *
     * @param patientDtoData
     * @return
     */
    public static DSSRequest generateRequest(PatientDto patientDtoData) {
        DSSRequest request = new DSSRequest();
        DSSRequest.Patient patient = new DSSRequest.Patient();
        request.setPatient(patient);

        fillPatientPropertiesPart(request, patientDtoData);
        fillPatientRisksPart(request, patientDtoData);
        fillPatientProblemsPart(request, patientDtoData);
        fillPatientInvestigationsPart(request, patientDtoData);
        fillPatientInterventionsPart(request, patientDtoData);
        fillSystemPart(request, patientDtoData);

        return request;
    }

    private static DSSRequest fillPatientPropertiesPart(DSSRequest request, PatientDto patientDtoData) {
        DSSRequest.Patient.Properties properties = new DSSRequest.Patient.Properties();
        DSSRequest.Patient.Properties.BirthTimeStamp birthTimeStamp = new DSSRequest.Patient.Properties.BirthTimeStamp();
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(patientDtoData.getBirthDate());

        birthTimeStamp.setYear(calendar.get(Calendar.YEAR));
        birthTimeStamp.setMonth(calendar.get(Calendar.MONTH));
        birthTimeStamp.setDay(calendar.get(Calendar.DAY_OF_MONTH));
        birthTimeStamp.setHour(calendar.get(Calendar.HOUR_OF_DAY));
        birthTimeStamp.setMinute(calendar.get(Calendar.MINUTE));

        properties.setBirthTimeStamp(birthTimeStamp);

        properties.setGender(patientDtoData.getGender() ==  Gender.FEMALE ? "1" : "0");

        request.getPatient().setProperties(properties);

        return request;
    }

    private static DSSRequest fillPatientRisksPart(DSSRequest request, PatientDto patientDtoData) {
        DSSRequest.Patient.Risks risks = new DSSRequest.Patient.Risks();
        DSSRequest.Patient.Risks.Smoking smoking = new DSSRequest.Patient.Risks.Smoking();
        DSSRequest.Patient.Risks.Smoking.SmokingStatus smokingStatus = new DSSRequest.Patient.Risks.Smoking.SmokingStatus();
        smokingStatus.getContent().add(patientDtoData.isSmoking() ? "1" : "-1");
        smoking.setSmokingStatus(smokingStatus);
        risks.setSmoking(smoking);

        DSSRequest.Patient.Risks.Pregnancy pregnancy = new DSSRequest.Patient.Risks.Pregnancy();
        pregnancy.setPregnant(patientDtoData.isPregnancy());
        risks.setPregnancy(pregnancy);

        DSSRequest.Patient.Risks.Lactation lactation = new DSSRequest.Patient.Risks.Lactation();
        lactation.setLactating(patientDtoData.isLactation());
        risks.setLactation(lactation);

        request.getPatient().setRisks(risks);

        return request;
    }

    private static DSSRequest fillPatientProblemsPart(DSSRequest request, PatientDto patientDtoData) {
        DSSRequest.Patient.Problems problems = new DSSRequest.Patient.Problems();
        DSSRequest.Patient.Problems.Diagnoses diagnoses = new DSSRequest.Patient.Problems.Diagnoses();
        for (PatientDiagnosisDto patientDiagnosisDto : patientDtoData.getDiagnoses()) {
            DSSRequest.Patient.Problems.Diagnoses.Diagnosis diagnosis = new DSSRequest.Patient.Problems.Diagnoses.Diagnosis();
            diagnosis.setCodeSystem(RequestDefaults.DIAGNOSES_CODE_SYSTEM);
            diagnosis.setCodeValue(patientDiagnosisDto.getClassifier().getCode());
            diagnosis.setDiagnosisName(patientDiagnosisDto.getClassifier().getName());

            DSSResponse.Reminders.Reminder.SuggestedActions.SuggestedAction.StartStamp startStamp = new DSSResponse.Reminders.Reminder.SuggestedActions.SuggestedAction.StartStamp();
            startStamp.setStartDate(new JAXBElement<>(new QName("StartDate"), XMLGregorianCalendar.class, convertDateToXMLCalendar(patientDiagnosisDto.getStartDate())));
            diagnosis.setStartStamp(startStamp);

            diagnoses.getDiagnosis().add(diagnosis);
        }

        problems.setDiagnoses(diagnoses);

        request.getPatient().setProblems(problems);

        return request;
    }

    private static DSSRequest fillPatientInvestigationsPart(DSSRequest request, PatientDto patientDtoData) {
        DSSRequest.Patient.Investigations investigations = new DSSRequest.Patient.Investigations();
        DSSRequest.Patient.Investigations.Measurements measurements = new DSSRequest.Patient.Investigations.Measurements();
        for (PatientMeasurementDto patientMeasurementDto : patientDtoData.getMeasurements()) {
            DSSRequest.Patient.Investigations.Measurements.Measurement measurement = new DSSRequest.Patient.Investigations.Measurements.Measurement();
            measurement.setCodeValue(patientMeasurementDto.getClassifier().getCode());
            measurement.setCodeSystem(RequestDefaults.MEASUREMENTS_CODE_SYSTEM);

            DSSResponse.Reminders.Reminder.SuggestedActions.SuggestedAction.PointStamp pointStamp = new DSSResponse.Reminders.Reminder.SuggestedActions.SuggestedAction.PointStamp();
            pointStamp.setPointDate(new JAXBElement<>(new QName("PointDate"), XMLGregorianCalendar.class, convertDateToXMLCalendar(patientMeasurementDto.getDate())));
            measurement.setPointStamp(pointStamp);
            measurement.setOrdered(false);
            DSSRequest.Patient.Investigations.Measurements.Measurement.Result result = new DSSRequest.Patient.Investigations.Measurements.Measurement.Result();
            result.setValue(patientMeasurementDto.getValue());
            result.setUnit(patientMeasurementDto.getClassifier().getUnit());
            measurement.setResult(result);

            measurements.getMeasurement().add(measurement);
        }

        investigations.setMeasurements(measurements);
        request.getPatient().setInvestigations(investigations);

        return request;
    }

    private static DSSRequest fillPatientInterventionsPart(DSSRequest request, PatientDto patientDtoData) {
        DSSRequest.Patient.Interventions interventions = new DSSRequest.Patient.Interventions();

        DSSRequest.Patient.Interventions.Medication medication = new DSSRequest.Patient.Interventions.Medication();
        for (PatientMedicationDto patientMedicationDto : patientDtoData.getMedications()) {
            DSSRequest.Patient.Interventions.Medication.Drug drug = new DSSRequest.Patient.Interventions.Medication.Drug();
            drug.getCodeGroup().add(new JAXBElement<>(new QName("CodeValue"), String.class, patientMedicationDto.getClassifier().getCode()));
            drug.getCodeGroup().add(new JAXBElement<>(new QName("CodeSystem"), String.class, RequestDefaults.MEDICATION_CODE_SYSTEM ));
            drug.setDrugName(patientMedicationDto.getClassifier().getName());

            DSSResponse.Reminders.Reminder.SuggestedActions.SuggestedAction.StartStamp startStamp = new DSSResponse.Reminders.Reminder.SuggestedActions.SuggestedAction.StartStamp();
            startStamp.setStartDate(new JAXBElement<>(new QName("StartDate"), XMLGregorianCalendar.class, convertDateToXMLCalendar(patientMedicationDto.getStartDate())));
            drug.setStartStamp(startStamp);

            medication.getDrug().add(drug);
        }

        interventions.setMedication(medication);

        DSSRequest.Patient.Interventions.Vaccinations vaccinations = new DSSRequest.Patient.Interventions.Vaccinations();
        interventions.setVaccinations(vaccinations);

        DSSRequest.Patient.Interventions.Procedures procedures = new DSSRequest.Patient.Interventions.Procedures();
        interventions.setProcedures(procedures);

        request.getPatient().setInterventions(interventions);

        return request;
    }

    private static DSSRequest fillSystemPart(DSSRequest request, PatientDto patientDtoData) {
        DSSRequest.System system = new DSSRequest.System();
        DSSRequest.System.User user = new DSSRequest.System.User();
        user.setHealthCareRole(RequestDefaults.HEALTH_CARE_ROLE);

        DSSRequest.System.User.Language language = new DSSRequest.System.User.Language();
        language.setCodeValue(RequestDefaults.LANGUAGE_CODE);
        language.setCodeSystem(RequestDefaults.LANGUAGE_CODE_SYSTEM);
        user.setLanguage(language);

        DSSRequest.System.User.Nation nation = new DSSRequest.System.User.Nation();
        nation.setCodeValue(RequestDefaults.NATION_CODE);
        nation.setCodeSystem(RequestDefaults.NATION_CODE_SYSTEM);
        user.setNation(nation);

        system.setUser(user);

        DSSRequest.System.Application application = new DSSRequest.System.Application();
        application.setQueryID(RequestDefaults.APPLICATION_QUERY_ID);
        application.setDSSVersion(RequestDefaults.APPLICATION_DSS_VERSION);
        application.setFeedbackType(RequestDefaults.FEEDBACK_TYPE);

        DSSRequest.System.Application.CheckMoment checkMoment = new DSSRequest.System.Application.CheckMoment();
        checkMoment.setCheckDate(convertDateToXMLCalendar(new Date()));

        application.setCheckMoment(checkMoment);

        DSSRequest.System.Application.EventTypes eventTypes = new DSSRequest.System.Application.EventTypes();
        eventTypes.getEventType().add(RequestDefaults.APPLICATION_EVENT_TYPE);

        application.setEventTypes(eventTypes);

        system.setApplication(application);

        request.setSystem(system);

        return request;
    }

    private static synchronized XMLGregorianCalendar convertDateToXMLCalendar (Date date) {
        gregorianCalendar.setTime(date);

        try {
            return DatatypeFactory.newInstance().newXMLGregorianCalendarDate(
                    gregorianCalendar.get(Calendar.YEAR),
                    gregorianCalendar.get(Calendar.MONTH)+1,
                    gregorianCalendar.get(Calendar.DAY_OF_MONTH),
                    DatatypeConstants.FIELD_UNDEFINED);
        } catch (DatatypeConfigurationException e) {
            LOGGER.error("Error while generating DSSRequest", e);
        }

        return null;
    }
}
