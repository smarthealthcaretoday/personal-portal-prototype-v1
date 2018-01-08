package today.smarthealthcare.ppv1.controllers;

import today.smarthealthcare.ppv1.dto.log.PatientActionDto;
import today.smarthealthcare.ppv1.persistence.dao.PatientActionDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Patient actions log
 *
 * @author: Vadim Nesmashnov
 */
@RestController
public class PatientActionsController {
    @Autowired
    private PatientActionDao patientActionDao;

    @RequestMapping(value = "/allActions", method = RequestMethod.POST)
    public List<PatientActionDto> getAllActions() {
        return patientActionDao.getAllActions();
    }
}
