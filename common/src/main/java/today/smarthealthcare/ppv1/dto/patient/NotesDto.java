package today.smarthealthcare.ppv1.dto.patient;

import java.io.Serializable;

/**
 * Notes DTO
 *
 * @author: Vadim Nesmashnov
 */
public class NotesDto implements Serializable {
    private Long id;
    private Long patientId;
    private String notes;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getPatientId() {
        return patientId;
    }

    public void setPatientId(Long patientId) {
        this.patientId = patientId;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    @Override
    public String toString() {
        return "NotesDto{" +
                "id=" + id +
                ", patientId=" + patientId +
                ", notes='" + notes + '\'' +
                '}';
    }
}
