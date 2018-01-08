package today.smarthealthcare.ppv1.persistence.repository.patient;

import today.smarthealthcare.ppv1.persistence.BaseH2DBTest;
import today.smarthealthcare.ppv1.persistence.model.classifier.ClassifierId;
import today.smarthealthcare.ppv1.persistence.model.classifier.MeasurementClassifier;
import today.smarthealthcare.ppv1.persistence.model.patient.Gender;
import today.smarthealthcare.ppv1.persistence.model.patient.Patient;
import today.smarthealthcare.ppv1.persistence.model.patient.PatientMeasurement;
import today.smarthealthcare.ppv1.persistence.repository.classifier.DiagnosisClassifierRepository;
import today.smarthealthcare.ppv1.persistence.repository.classifier.MeasurementClassifierRepository;
import junit.framework.Assert;
import today.smarthealthcare.ppv1.persistence.model.classifier.ClassifierId;
import today.smarthealthcare.ppv1.persistence.model.classifier.MeasurementClassifier;
import today.smarthealthcare.ppv1.persistence.model.patient.Gender;
import today.smarthealthcare.ppv1.persistence.model.patient.Patient;
import today.smarthealthcare.ppv1.persistence.model.patient.PatientMeasurement;
import today.smarthealthcare.ppv1.persistence.repository.classifier.MeasurementClassifierRepository;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Arrays;
import java.util.Date;
import java.util.List;

public class PatientMeasurementRepositoryTest extends BaseH2DBTest {
    @Autowired
    private PatientRepository patientRepository;
    @Autowired
    private MeasurementClassifierRepository measurementClassifierRepository;
    @Autowired
    private PatientMeasurementRepository repository;

    private final static Date NOW = new Date();

    @Test
    public void testFindByPatientIdAndClassifierCodeAndDateRange() throws Exception {
        Patient patient = new Patient();
        patient.setLegalCode("123456789");
        patient.setName("Patient1");
        patient.setSurname("Patient1Surname");
        patient.setEmail("test@test.com");
        patient.setGender(Gender.FEMALE);
        patient.setSmoking(true);

        patient = patientRepository.saveAndFlush(patient);

        MeasurementClassifier classifier = new MeasurementClassifier();
        ClassifierId classifierId = new ClassifierId("test", "test");
        classifier.setId(classifierId);
        classifier.setUnit("test");

        measurementClassifierRepository.saveAndFlush(classifier);

        PatientMeasurement measurement = new PatientMeasurement();
        measurement.setId(1L);
        measurement.setDate(NOW);
        measurement.setValue(34d);
        measurement.setPatient(patient);
        measurement.setClassifier(classifier);

        repository.saveAndFlush(measurement);

        List<PatientMeasurement> found = repository.findByPatientIdAndClassifierCodeAndDateRange(patient.getId(), Arrays.asList(classifier.getId().getCode()), NOW, NOW);
        Assert.assertEquals(1, found.size());
    }
}
