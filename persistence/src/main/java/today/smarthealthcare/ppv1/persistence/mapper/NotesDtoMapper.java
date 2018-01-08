package today.smarthealthcare.ppv1.persistence.mapper;

import today.smarthealthcare.ppv1.dto.patient.NotesDto;
import today.smarthealthcare.ppv1.persistence.model.patient.Notes;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

import today.smarthealthcare.ppv1.dto.patient.NotesDto;
import today.smarthealthcare.ppv1.persistence.model.patient.Notes;

/**
 * Notes DTO mapper
 *
 * @author: Vadim Nesmashnov
 */
@Component
public class NotesDtoMapper extends DtoMapper<NotesDto, Notes> {
    @PostConstruct
    public void init() {
        setDtoType(NotesDto.class);
        setEntityType(Notes.class);
    }
}
