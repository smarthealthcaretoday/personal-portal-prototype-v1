package today.smarthealthcare.ppv1.persistence.mapper;

import today.smarthealthcare.ppv1.dto.classifier.ClassifierDto;
import today.smarthealthcare.ppv1.dto.classifier.DiagnosisClassifierDto;
import today.smarthealthcare.ppv1.dto.classifier.MeasurementClassifierDto;
import today.smarthealthcare.ppv1.dto.classifier.MedicationClassifierDto;
import today.smarthealthcare.ppv1.dto.patient.PatientDiagnosisDto;
import today.smarthealthcare.ppv1.dto.patient.PatientDrugToAvoidDto;
import today.smarthealthcare.ppv1.dto.patient.PatientDto;
import today.smarthealthcare.ppv1.dto.patient.PatientMeasurementDto;
import today.smarthealthcare.ppv1.persistence.config.DozerConfig;
import today.smarthealthcare.ppv1.persistence.model.classifier.ClassifierId;
import today.smarthealthcare.ppv1.persistence.model.classifier.DiagnosisClassifier;
import today.smarthealthcare.ppv1.persistence.model.classifier.MedicationClassifier;
import today.smarthealthcare.ppv1.persistence.model.patient.Gender;
import today.smarthealthcare.ppv1.persistence.model.patient.Patient;
import today.smarthealthcare.ppv1.persistence.model.patient.PatientDiagnosis;
import today.smarthealthcare.ppv1.persistence.model.patient.PatientMeasurement;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.support.AnnotationConfigContextLoader;

import java.util.*;

import static junit.framework.Assert.assertEquals;
import static junit.framework.Assert.assertNotNull;

import junit.framework.Assert;
import today.smarthealthcare.ppv1.dto.patient.PatientDiagnosisDto;
import today.smarthealthcare.ppv1.dto.patient.PatientDrugToAvoidDto;
import today.smarthealthcare.ppv1.dto.patient.PatientDto;
import today.smarthealthcare.ppv1.dto.patient.PatientMeasurementDto;
import today.smarthealthcare.ppv1.persistence.config.DozerConfig;
import today.smarthealthcare.ppv1.persistence.model.classifier.ClassifierId;
import today.smarthealthcare.ppv1.persistence.model.classifier.DiagnosisClassifier;
import today.smarthealthcare.ppv1.persistence.model.classifier.MedicationClassifier;
import today.smarthealthcare.ppv1.persistence.model.patient.Gender;
import today.smarthealthcare.ppv1.persistence.model.patient.Patient;
import today.smarthealthcare.ppv1.persistence.model.patient.PatientDiagnosis;
import today.smarthealthcare.ppv1.persistence.model.patient.PatientMeasurement;

/**
 * @author: Vadim Nesmashnov
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(loader = AnnotationConfigContextLoader.class,
        classes = {DozerConfig.class})
public class DtoMapperTest {

    @Autowired
    private PatientDtoMapper patientMapper;

    @Test
    public void testGetPatientDto() throws Exception {
        Patient patient = new Patient();
        patient.setId(1L);
        patient.setName("Name");
        patient.setSurname("Surname");
        patient.setGender(Gender.FEMALE);
        patient.setBirthDate(new Date());
        patient.setLactation(true);
        patient.setLegalCode("1234567890");

        DiagnosisClassifier diagnosisClassifier = new DiagnosisClassifier();
        ClassifierId classifierId = new ClassifierId("123", "Name");
        diagnosisClassifier.setId(classifierId);

        PatientDiagnosis patientDiagnosis = new PatientDiagnosis();
        patientDiagnosis.setId(12L);
        patientDiagnosis.setClassifier(diagnosisClassifier);
        patientDiagnosis.setPatient(patient);
        patientDiagnosis.setStartDate(new Date());

        Set<PatientDiagnosis> patientDiagnosisList = new HashSet<>();
        patientDiagnosisList.add(patientDiagnosis);

        patient.setDiagnoses(patientDiagnosisList);

        PatientDto patientDto = patientMapper.getDto(patient);

        assertNotNull(patientDto);
        Assert.assertEquals(today.smarthealthcare.ppv1.dto.patient.Gender.FEMALE, patientDto.getGender());
        assertEquals(true, patientDto.isLactation());

        assertEquals("123", patientDto.getDiagnoses().get(0).getClassifier().getCode());
    }

    @Test
    public void testGetPersistedPatient() throws Exception {
        PatientDto patientDto = new PatientDto();
        patientDto.setId(1L);
        patientDto.setName("Name");
        patientDto.setSurname("Surname");
        patientDto.setGender(today.smarthealthcare.ppv1.dto.patient.Gender.FEMALE);
        patientDto.setBirthDate(new Date());
        patientDto.setLactation(true);
        patientDto.setLegalCode("1234567890");


        DiagnosisClassifierDto diagnosisClassifierDto = new DiagnosisClassifierDto();
        DiagnosisClassifierDto diagnosisClassifierOriginalObject = new DiagnosisClassifierDto();
        diagnosisClassifierOriginalObject.setCode("123");
        diagnosisClassifierOriginalObject.setName("Name");
        diagnosisClassifierDto.setOriginalObject(diagnosisClassifierOriginalObject);

        PatientDiagnosisDto patientDiagnosisDto = new PatientDiagnosisDto();
        patientDiagnosisDto.setId(12L);
        patientDiagnosisDto.setClassifier(diagnosisClassifierDto);
        patientDiagnosisDto.setStartDate(new Date());

        List<PatientDiagnosisDto> patientDiagnosisList = new ArrayList<>();
        patientDiagnosisList.add(patientDiagnosisDto);

        patientDto.setDiagnoses(patientDiagnosisList);

        MeasurementClassifierDto measurementClassifierDto = new MeasurementClassifierDto();
        ClassifierDto measurementClassifierDtoOriginalObject = new ClassifierDto();
        measurementClassifierDtoOriginalObject.setCode("234");
        measurementClassifierDtoOriginalObject.setName("Namerr");
//        measurementClassifierDtoOriginalObject.setUnit("cm");
        measurementClassifierDto.setOriginalObject(measurementClassifierDtoOriginalObject);

        PatientMeasurementDto patientMeasurementDto = new PatientMeasurementDto();
        patientMeasurementDto.setId(12L);
        patientMeasurementDto.setClassifier(measurementClassifierDto);
        patientMeasurementDto.setDate(new Date());

        List<PatientMeasurementDto> patientMeasurements = new ArrayList<>();
        patientMeasurements.add(patientMeasurementDto);

        patientDto.setMeasurements(patientMeasurements);

        MedicationClassifierDto medicationClassifier = new MedicationClassifierDto();
        MedicationClassifierDto medicationClassifierOriginalObject = new MedicationClassifierDto("321", "drug", "");
        medicationClassifier.setOriginalObject(medicationClassifierOriginalObject);

        PatientDrugToAvoidDto patientDrugToAvoid = new PatientDrugToAvoidDto();
        patientDrugToAvoid.setClassifier(medicationClassifier);

        List<PatientDrugToAvoidDto> patientDrugsToAvoid = new ArrayList<>();
        patientDrugsToAvoid.add(patientDrugToAvoid);

        patientDto.setDrugsToAvoid(patientDrugsToAvoid);

        Patient patient = patientMapper.getEntity(patientDto);

        assertNotNull(patient);
        assertEquals(Gender.FEMALE, patient.getGender());
        assertEquals(Boolean.TRUE, patient.getLactation());

        assertEquals(1, patient.getDiagnoses().size());
        for (Iterator<PatientDiagnosis> it = patient.getDiagnoses().iterator(); it.hasNext(); ) {
            Assert.assertEquals("123", it.next().getClassifier().getId().getCode());
        }

        assertEquals(1, patient.getMeasurements().size());
        for (Iterator<PatientMeasurement> it = patient.getMeasurements().iterator(); it.hasNext(); ) {
            assertEquals("234", it.next().getClassifier().getId().getCode());
//            assertEquals("cm", it.next().getClassifier().getUnit());
        }

        assertNotNull(patient.getDrugsToAvoid());
        assertEquals(1, patient.getDrugsToAvoid().size());
        for (Iterator<MedicationClassifier> it = patient.getDrugsToAvoid().iterator(); it.hasNext(); ) {
            assertEquals("321", it.next().getId().getCode());
        }
    }
}
