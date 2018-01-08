package today.smarthealthcare.ppv1.persistence.model.patient;

import today.smarthealthcare.ppv1.persistence.model.classifier.ProcedureClassifier;

import javax.persistence.*;
import java.util.Date;

import today.smarthealthcare.ppv1.persistence.model.classifier.ProcedureClassifier;

/**
 * @author: Vadim Nesmashnov
 */
@Entity
@Table(name = "PATIENTPROCEDURES")
public class PatientProcedure {
    @Id
    @GeneratedValue
    private Long id;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "patient_id", nullable = false)
    private Patient patient;

    @ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.REFRESH)
    @JoinColumns({
            @JoinColumn(name = "procedureclassifier_code", nullable = false),
            @JoinColumn(name = "procedureclassifier_name", nullable = false)
    })
    private ProcedureClassifier classifier;

    @Temporal(TemporalType.TIMESTAMP)
    private Date date;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Patient getPatient() {
        return patient;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
    }

    public ProcedureClassifier getClassifier() {
        return classifier;
    }

    public void setClassifier(ProcedureClassifier classifier) {
        this.classifier = classifier;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        PatientProcedure that = (PatientProcedure) o;

        if (!classifier.equals(that.classifier)) return false;
        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        if (patient != null ? !patient.equals(that.patient) : that.patient != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (patient != null ? patient.hashCode() : 0);
        result = 31 * result + classifier.hashCode();
        return result;
    }
}
