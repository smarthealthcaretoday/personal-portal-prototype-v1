package today.smarthealthcare.ppv1.persistence.dao;

import today.smarthealthcare.ppv1.dto.log.ActionType;
import today.smarthealthcare.ppv1.dto.log.PatientActionDto;
import today.smarthealthcare.ppv1.persistence.BaseH2DBTest;
import today.smarthealthcare.ppv1.persistence.model.patient.Gender;
import today.smarthealthcare.ppv1.persistence.model.patient.Patient;
import today.smarthealthcare.ppv1.persistence.repository.patient.PatientRepository;
import junit.framework.Assert;
import today.smarthealthcare.ppv1.dto.log.ActionType;
import today.smarthealthcare.ppv1.dto.log.PatientActionDto;
import today.smarthealthcare.ppv1.persistence.model.patient.Gender;
import today.smarthealthcare.ppv1.persistence.model.patient.Patient;
import today.smarthealthcare.ppv1.persistence.repository.patient.PatientRepository;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * @author: Vadim Nesmashnov
 */
public class PatientActionDAOTest extends BaseH2DBTest {
    @Autowired
    private PatientActionDao patientActionDao;

    @Autowired
    private PatientRepository patientRepository;

    @Test
    public void testStorePatientAction() throws Exception {
        Patient patient = new Patient();
        patient.setId(1L);
        patient.setLegalCode("123456789");
        patient.setName("Patient");
        patient.setSurname("PatientSurname");
        patient.setEmail("test@test.com");
        patient.setGender(Gender.FEMALE);
        patient.setSmoking(true);

        patientRepository.saveAndFlush(patient);

        patientActionDao.storePatientAction(1L, ActionType.EBMEDS_REQUEST, "<request>test</request>");

        List<PatientActionDto> patientActions = patientActionDao.getAllActions();

        Assert.assertEquals(1, patientActions.size());

        PatientActionDto patientAction = patientActions.get(0);

        Assert.assertEquals(1L, patientAction.getId().longValue());
        Assert.assertEquals(ActionType.EBMEDS_REQUEST, patientAction.getActionType());
        Assert.assertEquals("Patient PatientSurname", patientAction.getPatientName());

    }
}
