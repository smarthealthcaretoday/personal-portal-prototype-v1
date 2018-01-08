package today.smarthealthcare.ppv1.persistence.repository;

import today.smarthealthcare.ppv1.persistence.BaseH2DBTest;
import today.smarthealthcare.ppv1.persistence.model.classifier.ClassifierId;
import today.smarthealthcare.ppv1.persistence.model.classifier.DiagnosisClassifier;
import today.smarthealthcare.ppv1.persistence.model.classifier.MedicationClassifier;
import today.smarthealthcare.ppv1.persistence.model.patient.Gender;
import today.smarthealthcare.ppv1.persistence.model.patient.Patient;
import today.smarthealthcare.ppv1.persistence.model.patient.PatientDiagnosis;
import today.smarthealthcare.ppv1.persistence.repository.classifier.DiagnosisClassifierRepository;
import today.smarthealthcare.ppv1.persistence.repository.classifier.MedicationClassifierRepository;
import today.smarthealthcare.ppv1.persistence.repository.patient.PatientRepository;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Date;
import java.util.Iterator;

import static junit.framework.Assert.*;

import today.smarthealthcare.ppv1.persistence.model.classifier.ClassifierId;
import today.smarthealthcare.ppv1.persistence.model.classifier.DiagnosisClassifier;
import today.smarthealthcare.ppv1.persistence.model.classifier.MedicationClassifier;
import today.smarthealthcare.ppv1.persistence.model.patient.Gender;
import today.smarthealthcare.ppv1.persistence.model.patient.Patient;
import today.smarthealthcare.ppv1.persistence.model.patient.PatientDiagnosis;
import today.smarthealthcare.ppv1.persistence.repository.classifier.DiagnosisClassifierRepository;
import today.smarthealthcare.ppv1.persistence.repository.classifier.MedicationClassifierRepository;
import today.smarthealthcare.ppv1.persistence.repository.patient.PatientRepository;

/**
 * @author: Vadim Nesmashnov
 */
@Ignore
public class PatientRepositoryTest extends BaseH2DBTest {
    @Autowired
    private PatientRepository patientRepository;

    @Autowired
    private DiagnosisClassifierRepository diagnosisClassifierRepository;
    @Autowired
    private MedicationClassifierRepository medicationClassifierRepository;

    private static Patient patient;

    @Before
    public void setUp() {
        patient = new Patient();
        patient.setLegalCode("123456789");
        patient.setName("Patient1");
        patient.setSurname("Patient1Surname");
        patient.setEmail("test@test.com");
        patient.setGender(Gender.FEMALE);
        patient.setSmoking(true);
    }

    @Test
    public void testFindBySurname() throws Exception {
        patientRepository.saveAndFlush(patient);

        Patient found = patientRepository.findByEmail("test@test.com");

        assertNotNull(found);
        assertEquals(Gender.FEMALE, found.getGender());

        patientRepository.delete(patient);

        found = patientRepository.findByEmail("test@test.com");

        assertNull(found);
    }

    @Test
    public void testSaveWithDiagnosis() {
        Patient savedPatient = patientRepository.saveAndFlush(patient);

        DiagnosisClassifier classifier = new DiagnosisClassifier();
        ClassifierId classifierId = new ClassifierId("123", "Name");
        classifier.setId(classifierId);

        DiagnosisClassifier classifier1 = new DiagnosisClassifier();
        ClassifierId classifierId1 = new ClassifierId("125", "Nameg");
        classifier1.setId(classifierId1);

        diagnosisClassifierRepository.saveAndFlush(classifier);
        diagnosisClassifierRepository.saveAndFlush(classifier1);

        PatientDiagnosis patientDiagnosis = new PatientDiagnosis();
        patientDiagnosis.setClassifier(classifier);
        patientDiagnosis.setPatient(savedPatient);
        patientDiagnosis.setStartDate(new Date());

        PatientDiagnosis patientDiagnosis1 = new PatientDiagnosis();
        patientDiagnosis1.setClassifier(classifier1);
        patientDiagnosis1.setPatient(savedPatient);
        patientDiagnosis1.setStartDate(new Date());

        savedPatient.getDiagnoses().add(patientDiagnosis);
        savedPatient = patientRepository.saveAndFlush(savedPatient);

        Patient loadedPatient = patientRepository.findOne(savedPatient.getId());

        assertNotNull(loadedPatient);

        for (Iterator<PatientDiagnosis> it = loadedPatient.getDiagnoses().iterator(); it.hasNext();) {
            assertEquals(it.next().getClassifier().getId().getCode(), classifier.getId().getCode());
        }

        loadedPatient.getDiagnoses().add(patientDiagnosis1);

        patientRepository.saveAndFlush(loadedPatient);

        Patient loadedPatient1 = patientRepository.findOne(savedPatient.getId());
        assertEquals(2, loadedPatient1.getDiagnoses().size());

        patientRepository.delete(loadedPatient1);
        diagnosisClassifierRepository.delete(classifier);
    }

    @Test
    public void testSaveWithDrugsToAvoid() {
        Patient savedPatient = patientRepository.saveAndFlush(patient);

        MedicationClassifier classifier = new MedicationClassifier();
        ClassifierId classifierId = new ClassifierId("123", "Name");
        classifier.setId(classifierId);

        MedicationClassifier classifier1 = new MedicationClassifier();
        ClassifierId classifierId1 = new ClassifierId("456", "Name1");
        classifier1.setId(classifierId1);

        medicationClassifierRepository.saveAndFlush(classifier);
        medicationClassifierRepository.saveAndFlush(classifier1);

        savedPatient.getDrugsToAvoid().add(classifier);

        savedPatient = patientRepository.saveAndFlush(savedPatient);

        Patient loadedPatient = patientRepository.findOne(savedPatient.getId());

        assertNotNull(loadedPatient);
        assertEquals(1, loadedPatient.getDrugsToAvoid().size());

        loadedPatient.getDrugsToAvoid().add(classifier1);

        savedPatient = patientRepository.saveAndFlush(loadedPatient);

        Patient loadedPatient1 = patientRepository.findOne(loadedPatient.getId());
        assertEquals(2, loadedPatient1.getDrugsToAvoid().size());

        patientRepository.delete(savedPatient);
        medicationClassifierRepository.delete(classifier);
        medicationClassifierRepository.delete(classifier1);
    }
}
