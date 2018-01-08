package today.smarthealthcare.ppv1.persistence.service;

import today.smarthealthcare.ppv1.dto.healthStatement.HealthStatementDto;
import today.smarthealthcare.ppv1.dto.patient.NotesDto;
import today.smarthealthcare.ppv1.dto.patient.PatientDto;
import today.smarthealthcare.ppv1.dto.patient.PatientMeasurementDto;
import today.smarthealthcare.ppv1.dto.selfHealthCheck.SelfHealthCheckDto;
import today.smarthealthcare.ppv1.persistence.model.patient.Patient;
import today.smarthealthcare.ppv1.persistence.model.patient.PatientMeasurement;

import java.util.Date;
import java.util.List;

import today.smarthealthcare.ppv1.dto.patient.NotesDto;
import today.smarthealthcare.ppv1.dto.patient.PatientDto;
import today.smarthealthcare.ppv1.dto.patient.PatientMeasurementDto;
import today.smarthealthcare.ppv1.persistence.model.patient.Patient;
import today.smarthealthcare.ppv1.persistence.model.patient.PatientMeasurement;

/**
 * Patient persistence service
 *
 * @author: Vadim Nesmashnov
 */
public interface IPatientPersistenceService {

    Patient getPatientById(Long id);

    PatientDto getPatientDtoById(Long id);

    PatientDto getPatientDtoByEmail(String email);

    Long storeNewPatient(PatientDto patient);

    void changePassword(Long id, String password);

    Long storePatientGeneralData(PatientDto patient);

    Long storePatientMedicalData(PatientDto patient);

    HealthStatementDto getPatientHealthStatement(Long patientId);

    Long storePatientHealthStatement(HealthStatementDto healthStatement);

    NotesDto getPatientNotes(Long patientId);

    Long storePatientNotes(NotesDto notes);

    void storePatientMeasurements(List<PatientMeasurement> measurements);

    List<PatientMeasurementDto> getPatientMeasurements(Long patientId, List<String> measurementCodes, Date startDate, Date endDate);

    SelfHealthCheckDto getPatientSelfHealthCheck(Long id);

    List<SelfHealthCheckDto> getPatientSelfHealthChecks(Long patientId, Date startDate, Date endDate);

    Long storePatientSelfHealthCheck(SelfHealthCheckDto selfHealthCheckDto);
}
