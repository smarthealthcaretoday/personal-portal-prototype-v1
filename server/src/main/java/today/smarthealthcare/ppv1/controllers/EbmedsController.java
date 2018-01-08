package today.smarthealthcare.ppv1.controllers;

import today.smarthealthcare.ppv1.dto.log.ActionType;
import today.smarthealthcare.ppv1.dto.patient.PatientDto;
import today.smarthealthcare.ppv1.dto.reminder.ReminderDto;
import today.smarthealthcare.ppv1.ebmeds.service.IEbmedsService;
import today.smarthealthcare.ppv1.persistence.dao.PatientActionDao;
import today.smarthealthcare.ppv1.persistence.service.IPatientPersistenceService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import today.smarthealthcare.ppv1.dto.patient.PatientDto;

/**
 * Controller responsible for communication with EBMeDS system
 *
 * @author: Vadim Nesmashnov
 */
@RestController
public class EbmedsController {
    private final static Logger LOGGER = LoggerFactory.getLogger(EbmedsController.class);
    @Autowired
    private IEbmedsService ebmedsService;
    @Autowired
    private IPatientPersistenceService patientPersistenceService;
    @Autowired
    private PatientActionDao patientActionDao;

    @RequestMapping(value = "/ebmedsRequest", method = RequestMethod.POST)
    public List<ReminderDto> ebmedsRequest(@RequestParam(value = "id") Long id) {

        PatientDto patientDto = patientPersistenceService.getPatientDtoById(id);

        patientActionDao.storePatientAction(id, ActionType.EBMEDS_REQUEST, "Patient medical data");

        List<ReminderDto> reminders =  ebmedsService.sendPatientDataToEbmeds(patientDto);

        StringBuilder sb = new StringBuilder();
        if (reminders.size() > 0) {
            for (ReminderDto reminder : reminders) {
                sb.append("Reminder: \"");
                sb.append(reminder.getForPatient()).append("\"");
                sb.append("\n");
            }
        } else {
            sb.append("No reminders");
        }

        patientActionDao.storePatientAction(id, ActionType.EBMEDS_RESPONSE, sb.toString());

        return reminders;
    }
}
