package today.smarthealthcare.ppv1.persistence.model.patient;

import today.smarthealthcare.ppv1.persistence.model.classifier.DiagnosisClassifier;

import javax.persistence.*;
import java.util.Date;

import today.smarthealthcare.ppv1.persistence.model.classifier.DiagnosisClassifier;

/**
 * @author: Vadim Nesmashnov
 */
@Entity
@Table(name = "PATIENTDIAGNOSES")
public class PatientDiagnosis {
    @Id
    @GeneratedValue
    private Long id;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "patient_id", nullable = false)
    private Patient patient;

    @ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.REFRESH)
    @JoinColumns({
            @JoinColumn(name = "diagnosisclassifier_code", nullable = false),
            @JoinColumn(name = "diagnosisclassifier_name", nullable = false)
    })
    private DiagnosisClassifier classifier;

    @Temporal(TemporalType.TIMESTAMP)
    private Date startDate;

    @Temporal(TemporalType.TIMESTAMP)
    private Date endDate;

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

    public DiagnosisClassifier getClassifier() {
        return classifier;
    }

    public void setClassifier(DiagnosisClassifier classifier) {
        this.classifier = classifier;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        PatientDiagnosis that = (PatientDiagnosis) o;

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
