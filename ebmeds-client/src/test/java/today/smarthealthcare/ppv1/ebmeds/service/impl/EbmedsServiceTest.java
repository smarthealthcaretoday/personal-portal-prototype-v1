package today.smarthealthcare.ppv1.ebmeds.service.impl;

import today.smarthealthcare.ppv1.dto.classifier.DiagnosisClassifierDto;
import today.smarthealthcare.ppv1.dto.classifier.MeasurementClassifierDto;
import today.smarthealthcare.ppv1.dto.classifier.MedicationClassifierDto;
import today.smarthealthcare.ppv1.dto.patient.*;
import today.smarthealthcare.ppv1.dto.reminder.ReminderDto;
import today.smarthealthcare.ppv1.ebmeds.service.IEbmedsService;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.ArrayList;
import java.util.GregorianCalendar;
import java.util.List;

import today.smarthealthcare.ppv1.dto.patient.Gender;
import today.smarthealthcare.ppv1.dto.patient.PatientDiagnosisDto;
import today.smarthealthcare.ppv1.dto.patient.PatientDto;
import today.smarthealthcare.ppv1.dto.patient.PatientMeasurementDto;
import today.smarthealthcare.ppv1.dto.patient.PatientMedicationDto;

/**
 * @author: Vadim Nesmashnov
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("/spring/client/rest-client-context.xml")
public class EbmedsServiceTest {
    private final static Logger LOGGER = LoggerFactory.getLogger(EbmedsServiceTest.class);

    @Autowired
    private IEbmedsService ebmedsService;

    @Test
    @Ignore
    public void testSendPatientData() throws Exception {
        PatientDto patientDto = new PatientDto();
        patientDto.setBirthDate(new GregorianCalendar(1940, 11, 29).getTime());
        patientDto.setGender(Gender.MALE);
        patientDto.setSmoking(false);
        patientDto.setPregnancy(false);
        patientDto.setLactation(false);

        List<PatientMeasurementDto> measurements = new ArrayList<>();

        PatientMeasurementDto height = new PatientMeasurementDto();
        height.setValue("175");
        height.setDate(new GregorianCalendar(2014, 6, 12).getTime());
        height.setClassifier(new MeasurementClassifierDto("10006", "Height", "cm"));
        measurements.add(height);

        PatientMeasurementDto weight = new PatientMeasurementDto();
        weight.setValue("80");
        weight.setDate(new GregorianCalendar(2014, 6, 12).getTime());
        weight.setClassifier(new MeasurementClassifierDto("10014", "Weight", "kg"));
        measurements.add(weight);

        patientDto.setMeasurements(measurements);

        List<PatientDiagnosisDto> diagnosises = new ArrayList<>();
        PatientDiagnosisDto diagnosis = new PatientDiagnosisDto();
        diagnosis.setStartDate(new GregorianCalendar(2005, 6, 12).getTime());
        diagnosis.setClassifier(new DiagnosisClassifierDto("55", "Astma"));
        diagnosises.add(diagnosis);

        patientDto.setDiagnoses(diagnosises);

        List<PatientMedicationDto> medications = new ArrayList<>();
        PatientMedicationDto medication = new PatientMedicationDto();
        medication.setClassifier(new MedicationClassifierDto("M05BA04", "Fosamax", ""));
        medication.setStartDate(new GregorianCalendar(2005, 6, 12).getTime());
        medications.add(medication);

        patientDto.setMedications(medications);

        List<ReminderDto> reminders = ebmedsService.sendPatientDataToEbmeds(patientDto);

        LOGGER.debug("Received: {}", reminders);
    }
}
