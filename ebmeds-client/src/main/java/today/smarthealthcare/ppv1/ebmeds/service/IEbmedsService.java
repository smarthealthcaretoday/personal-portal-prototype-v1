package today.smarthealthcare.ppv1.ebmeds.service;

import today.smarthealthcare.ppv1.dto.patient.PatientDto;
import today.smarthealthcare.ppv1.dto.reminder.ReminderDto;

import java.util.List;

import today.smarthealthcare.ppv1.dto.patient.PatientDto;
import today.smarthealthcare.ppv1.dto.reminder.ReminderDto;

/**
 * Service responsible for communication with EBMeDS system
 *
 * @author: Vadim Nesmashnov
 */
public interface IEbmedsService {

    /**
     * Send given patient data to EBMeDS system and parse returned response
     *
     * @param patientDtoData
     * @return list of reminders from EBMeDS system
     */
    List<ReminderDto> sendPatientDataToEbmeds(PatientDto patientDtoData);

}
