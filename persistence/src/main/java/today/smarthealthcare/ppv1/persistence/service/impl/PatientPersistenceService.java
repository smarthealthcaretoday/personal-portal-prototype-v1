package today.smarthealthcare.ppv1.persistence.service.impl;

import today.smarthealthcare.ppv1.dto.healthStatement.HealthStatementDto;
import today.smarthealthcare.ppv1.dto.patient.NotesDto;
import today.smarthealthcare.ppv1.dto.patient.PatientDto;
import today.smarthealthcare.ppv1.dto.patient.PatientMeasurementDto;
import today.smarthealthcare.ppv1.dto.selfHealthCheck.SelfHealthCheckDto;
import today.smarthealthcare.ppv1.persistence.dao.PatientDao;
import today.smarthealthcare.ppv1.persistence.mapper.*;
import today.smarthealthcare.ppv1.persistence.model.healthStatement.HealthStatement;
import today.smarthealthcare.ppv1.persistence.model.patient.*;
import today.smarthealthcare.ppv1.persistence.model.selfHealthCheck.SelfHealthCheck;
import today.smarthealthcare.ppv1.persistence.repository.healthStatement.HealthStatementRepository;
import today.smarthealthcare.ppv1.persistence.repository.patient.NotesRepository;
import today.smarthealthcare.ppv1.persistence.repository.patient.PatientMeasurementRepository;
import today.smarthealthcare.ppv1.persistence.repository.patient.PatientRepository;
import today.smarthealthcare.ppv1.persistence.repository.selfHealthCheck.SelfHealthCheckRepository;
import today.smarthealthcare.ppv1.persistence.service.IPatientPersistenceService;
import com.google.common.base.Preconditions;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;

import today.smarthealthcare.ppv1.dto.patient.NotesDto;
import today.smarthealthcare.ppv1.dto.patient.PatientDto;
import today.smarthealthcare.ppv1.dto.patient.PatientMeasurementDto;
import today.smarthealthcare.ppv1.persistence.model.healthStatement.HealthStatement;
import today.smarthealthcare.ppv1.persistence.model.patient.Notes;
import today.smarthealthcare.ppv1.persistence.model.patient.Patient;
import today.smarthealthcare.ppv1.persistence.model.patient.PatientDiagnosis;
import today.smarthealthcare.ppv1.persistence.model.patient.PatientMeasurement;
import today.smarthealthcare.ppv1.persistence.model.patient.PatientMedication;
import today.smarthealthcare.ppv1.persistence.model.patient.PatientVaccination;
import today.smarthealthcare.ppv1.persistence.repository.healthStatement.HealthStatementRepository;
import today.smarthealthcare.ppv1.persistence.repository.patient.NotesRepository;
import today.smarthealthcare.ppv1.persistence.repository.patient.PatientMeasurementRepository;
import today.smarthealthcare.ppv1.persistence.repository.patient.PatientRepository;
import today.smarthealthcare.ppv1.persistence.repository.selfHealthCheck.SelfHealthCheckRepository;

/**
 * Patient persistence service
 *
 * @author: Vadim Nesmashnov
 */
@Service
public class PatientPersistenceService implements IPatientPersistenceService {
    private final static Logger LOGGER = LoggerFactory.getLogger(PatientPersistenceService.class);
    @Autowired
    private PatientRepository patientRepository;
    @Autowired
    private PatientDtoMapper patientMapper;
    @Autowired
    private HealthStatementRepository healthStatementRepository;
    @Autowired
    private HealthStatementDtoMapper healthStatementMapper;
    @Autowired
    private NotesRepository notesRepository;
    @Autowired
    private SelfHealthCheckRepository selfHealthCheckRepository;
    @Autowired
    private NotesDtoMapper notesMapper;
    @Autowired
    private SelfHealthCheckDtoMapper selfHealthCheckMapper;
    @Autowired
    private PatientMeasurementRepository measurementRepository;
    @Autowired
    private PatientMeasurementDtoMapper measurementDtoMapper;
    @Autowired
    private PatientDao patientDao;

    @Override
    public Patient getPatientById(Long id) {
        return patientRepository.findOne(id);
    }

    @Override
    public PatientDto getPatientDtoById(Long id) {
        Patient patient = patientRepository.findOne(id);

        return patient == null ? null : patientMapper.getDto(patient);
    }

    @Override
    public PatientDto getPatientDtoByEmail(String email) {
        Patient patient = patientRepository.findByEmail(email);

        return patient == null ? null : patientMapper.getDto(patient);
    }

    @Override
    public Long storeNewPatient(PatientDto patient) {
        Preconditions.checkNotNull(patient);

        Patient persistedPatient = patientMapper.getEntity(patient);

        persistedPatient = patientRepository.saveAndFlush(persistedPatient);

        return persistedPatient.getId();
    }

    @Override
    public void changePassword(Long id, String password) {
         patientDao.changePassword(id, password);
    }

    @Override
    public Long storePatientGeneralData(PatientDto patient) {
        Preconditions.checkNotNull(patient);

        Patient persistedPatient = patientMapper.getEntity(patient);

        Patient loadedPersistedPatient = patientRepository.findOne(patient.getId());

        if (loadedPersistedPatient == null) {
            persistedPatient = patientRepository.saveAndFlush(persistedPatient);
        } else {
            BeanUtils.copyProperties(persistedPatient, loadedPersistedPatient, "pregnancy", "lactation", "smoking", "password", "measurements", "diagnoses", "medications", "procedures", "vaccinations", "drugsToAvoid");
            persistedPatient = patientRepository.saveAndFlush(loadedPersistedPatient);
        }

        return persistedPatient.getId();
    }

    @Override
    public Long storePatientMedicalData(PatientDto patient) {
        Preconditions.checkNotNull(patient);

        Patient persistedPatient = patientMapper.getEntity(patient);

        Patient loadedPersistedPatient = patientRepository.findOne(patient.getId());

        if (loadedPersistedPatient == null) {
            persistedPatient = patientRepository.saveAndFlush(persistedPatient);
        } else {
            loadedPersistedPatient.setSmoking(persistedPatient.getSmoking());
            loadedPersistedPatient.setPregnancy(persistedPatient.getPregnancy());
            loadedPersistedPatient.setLactation(persistedPatient.getLactation());

            if (persistedPatient.getMeasurements() != null) {
                loadedPersistedPatient.getMeasurements().clear();
                for (PatientMeasurement measurement : persistedPatient.getMeasurements()) {
                    measurement.setPatient(loadedPersistedPatient);
                    loadedPersistedPatient.getMeasurements().add(measurement);
                }
            }

            if (persistedPatient.getMedications() != null) {
                loadedPersistedPatient.getMedications().clear();
                for (PatientMedication medication : persistedPatient.getMedications()) {
                    medication.setPatient(loadedPersistedPatient);
                    loadedPersistedPatient.getMedications().add(medication);
                }
            }

            if (persistedPatient.getVaccinations() != null) {
                loadedPersistedPatient.getVaccinations().clear();
                for (PatientVaccination vaccination : persistedPatient.getVaccinations()) {
                    vaccination.setPatient(loadedPersistedPatient);
                    loadedPersistedPatient.getVaccinations().add(vaccination);
                }
            }

            if (persistedPatient.getDiagnoses() != null) {
                loadedPersistedPatient.getDiagnoses().clear();
                for (PatientDiagnosis diagnosis : persistedPatient.getDiagnoses()) {
                    diagnosis.setPatient(loadedPersistedPatient);
                    loadedPersistedPatient.getDiagnoses().add(diagnosis);
                }
            }

            if (persistedPatient.getDrugsToAvoid() != null) {
                loadedPersistedPatient.getDrugsToAvoid().clear();
                loadedPersistedPatient.getDrugsToAvoid().addAll(persistedPatient.getDrugsToAvoid());
            }

            persistedPatient = patientRepository.saveAndFlush(loadedPersistedPatient);
        }

        return persistedPatient.getId();
    }

    @Override
    public HealthStatementDto getPatientHealthStatement(Long patientId) {
        HealthStatement healthStatement = healthStatementRepository.findByPatientId(patientId);

        if (healthStatement == null) {
            healthStatement = healthStatementRepository.saveAndFlush(new HealthStatement(patientId));

        }

        return healthStatementMapper.getDto(healthStatement);

    }

    @Override
    public Long storePatientHealthStatement(HealthStatementDto healthStatementDto) {
        HealthStatement healthStatement = healthStatementMapper.getEntity(healthStatementDto);

        healthStatement = healthStatementRepository.saveAndFlush(healthStatement);

        return healthStatement.getId();
    }

    @Override
    public NotesDto getPatientNotes(Long patientId) {
        Notes notes = notesRepository.findByPatientId(patientId);

        return notes == null ? null : notesMapper.getDto(notes);
    }

    @Override
    public Long storePatientNotes(NotesDto notesDto) {
        Notes notes = notesMapper.getEntity(notesDto);

        notes = notesRepository.saveAndFlush(notes);

        return notes.getId();
    }

    @Override
    public void storePatientMeasurements(List<PatientMeasurement> measurements) {
        for (Iterator<PatientMeasurement> it = measurements.iterator(); it.hasNext();) {
            PatientMeasurement measurement = it.next();
            if (measurementRepository.findByPatientAndClassifierAndDate(
                    measurement.getPatient(), measurement.getClassifier(), measurement.getDate()) != null) {
                LOGGER.debug("Excluding measurement: {}", measurement);

                it.remove();
            }
        }

        measurementRepository.save(measurements);
    }

    @Override
    public List<PatientMeasurementDto> getPatientMeasurements(Long patientId, List<String> measurementCodes, Date startDate, Date endDate) {
        List<PatientMeasurement> persistedMeasurements = measurementRepository.findByPatientIdAndClassifierCodeAndDateRange(patientId, measurementCodes, startDate, endDate);

        List<PatientMeasurementDto> measurementDtos = new ArrayList<>();

        for (PatientMeasurement persistedMeasurement : persistedMeasurements) {
            measurementDtos.add(measurementDtoMapper.getDto(persistedMeasurement));
        }

        return measurementDtos;
    }

    @Override
    public SelfHealthCheckDto getPatientSelfHealthCheck(Long id) {
        SelfHealthCheck selfHealthCheck = selfHealthCheckRepository.findOne(id);

        return selfHealthCheck == null ? null : selfHealthCheckMapper.getDto(selfHealthCheck);
    }

    @Override
    public List<SelfHealthCheckDto> getPatientSelfHealthChecks(Long patientId, Date startDate, Date endDate) {
        if (endDate == null) {
            endDate = new Date();
        }

        if (startDate == null || startDate.after(endDate)) {
            Calendar cal = GregorianCalendar.getInstance();
            cal.add(Calendar.DAY_OF_MONTH, -14);

            startDate = cal.getTime();
        }

        List<SelfHealthCheck> selfHealthChecks = selfHealthCheckRepository.findByPatientIdAndDateRange(patientId, startDate, endDate);
        List<SelfHealthCheckDto> selfHealthCheckDtos = new ArrayList<>();

        for (SelfHealthCheck selfHealthCheck : selfHealthChecks) {
            selfHealthCheckDtos.add(selfHealthCheckMapper.getDto(selfHealthCheck));
        }

        return selfHealthCheckDtos;
    }

    @Override
    public Long storePatientSelfHealthCheck(SelfHealthCheckDto selfHealthCheckDto) {
        SelfHealthCheck selfHealthCheck = selfHealthCheckMapper.getEntity(selfHealthCheckDto);

        if (selfHealthCheck.getDate() == null) {
            selfHealthCheck.setDate(new Date());
        }

        selfHealthCheck = selfHealthCheckRepository.saveAndFlush(selfHealthCheck);

        return selfHealthCheck.getId();
    }
}
