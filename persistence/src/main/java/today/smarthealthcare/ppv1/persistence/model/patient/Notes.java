package today.smarthealthcare.ppv1.persistence.model.patient;

import org.hibernate.annotations.Type;

import javax.persistence.*;

/**
 * Patient notes DB entity
 *
 * @author: Vadim Nesmashnov
 */
@Entity
@Table(name = "NOTES")
public class Notes {
    @Id
    @GeneratedValue
    private Long id;
    @Column(name = "PATIENT_ID")
    private Long patientId;
    @Type(type = "text")
    private String notes;

    public Notes() {
    }

    public Notes(Long patientId) {
        this.patientId = patientId;
    }

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
}
