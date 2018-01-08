package today.smarthealthcare.ppv1.persistence.mapper;

import today.smarthealthcare.ppv1.dto.patient.PatientDto;
import today.smarthealthcare.ppv1.persistence.model.patient.Patient;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

import today.smarthealthcare.ppv1.dto.patient.PatientDto;
import today.smarthealthcare.ppv1.persistence.model.patient.Patient;

/**
 * Patient DTO mapper
 *
 * @author: Vadim Nesmashnov
 */
@Component
public class PatientDtoMapper extends DtoMapper<PatientDto, Patient> {
    @PostConstruct
    public void init() {
        setDtoType(PatientDto.class);
        setEntityType(Patient.class);
    }
}
