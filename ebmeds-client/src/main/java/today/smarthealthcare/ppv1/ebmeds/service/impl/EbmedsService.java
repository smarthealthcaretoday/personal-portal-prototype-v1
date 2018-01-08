package today.smarthealthcare.ppv1.ebmeds.service.impl;

import today.smarthealthcare.ppv1.dto.patient.PatientDto;
import today.smarthealthcare.ppv1.dto.reminder.ReminderDto;
import today.smarthealthcare.ppv1.ebmeds.client.RestClient;
import today.smarthealthcare.ppv1.ebmeds.schema.beans.DSSRequest;
import today.smarthealthcare.ppv1.ebmeds.schema.beans.DSSResponse;
import today.smarthealthcare.ppv1.ebmeds.schema.beans.util.DSSRequestGenerator;
import today.smarthealthcare.ppv1.ebmeds.service.IEbmedsService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;
import org.springframework.stereotype.Service;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;

import javax.xml.transform.stream.StreamResult;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.List;

import today.smarthealthcare.ppv1.dto.patient.PatientDto;
import today.smarthealthcare.ppv1.dto.reminder.ReminderDto;
import today.smarthealthcare.ppv1.ebmeds.client.RestClient;
import today.smarthealthcare.ppv1.ebmeds.schema.beans.DSSRequest;
import today.smarthealthcare.ppv1.ebmeds.schema.beans.DSSResponse;
import today.smarthealthcare.ppv1.ebmeds.schema.beans.util.DSSRequestGenerator;

/**
 * @author: Vadim Nesmashnov
 */
@Service
public class EbmedsService implements IEbmedsService {

    private final static Logger LOGGER = LoggerFactory.getLogger(EbmedsService.class);
    private RestClient restClient;
    private Jaxb2Marshaller marshaller;

    @Autowired
    public EbmedsService(RestClient restClient, Jaxb2Marshaller marshaller) {
        this.restClient = restClient;
        this.marshaller = marshaller;
    }

    @Override
    public List<ReminderDto> sendPatientDataToEbmeds(PatientDto patientDtoData) {
        DSSRequest request = DSSRequestGenerator.generateRequest(patientDtoData);

        String url = restClient.createUrl(null);

        final StringWriter out = new StringWriter();
        marshaller.marshal(request, new StreamResult(out));

        LOGGER.debug("Outgoing message: {}", out.toString());

        MultiValueMap<String, Object> map = new LinkedMultiValueMap<>();
        map.add("dssData", out.toString());

        DSSResponse response = restClient.getRestTemplate().postForObject(url, map, DSSResponse.class);

        return getRemindersFromResponse(response);
    }

    private List<ReminderDto> getRemindersFromResponse(DSSResponse response) {
        List<ReminderDto> reminderDtos = new ArrayList<>();

        if (response.getReminders() != null) {
            for (DSSResponse.Reminders.Reminder dssReminder : response.getReminders().getReminder()) {
                ReminderDto reminderDto = new ReminderDto();
                reminderDto.setShortDescription((String) dssReminder.getReminderShort().getContent().get(0));
                reminderDto.setLongDescription((String) dssReminder.getReminderLong().getContent().get(0));
                reminderDto.setFroNurse((String) dssReminder.getReminderNurse().getContent().get(0));
                reminderDto.setForPatient((String) dssReminder.getReminderPatient().getContent().get(0));
                reminderDto.setLevel(dssReminder.getReminderLevel());

                reminderDtos.add(reminderDto);
            }
        }

        return reminderDtos;
    }
}
