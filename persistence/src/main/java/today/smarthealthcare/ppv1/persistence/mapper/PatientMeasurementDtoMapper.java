package today.smarthealthcare.ppv1.persistence.mapper;

import today.smarthealthcare.ppv1.dto.patient.NotesDto;
import today.smarthealthcare.ppv1.dto.patient.PatientMeasurementDto;
import today.smarthealthcare.ppv1.persistence.model.patient.Notes;
import today.smarthealthcare.ppv1.persistence.model.patient.PatientMeasurement;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

import today.smarthealthcare.ppv1.dto.patient.PatientMeasurementDto;
import today.smarthealthcare.ppv1.persistence.model.patient.PatientMeasurement;

@Component
public class PatientMeasurementDtoMapper extends DtoMapper<PatientMeasurementDto, PatientMeasurement> {
    @PostConstruct
    public void init() {
        setDtoType(PatientMeasurementDto.class);
        setEntityType(PatientMeasurement.class);
    }
}
