package today.smarthealthcare.ppv1.persistence.model.patient;

import today.smarthealthcare.ppv1.persistence.model.classifier.MeasurementClassifier;

import javax.persistence.*;
import java.util.Date;

import today.smarthealthcare.ppv1.persistence.model.classifier.MeasurementClassifier;

/**
 * @author: Vadim Nesmashnov
 */
@Entity
@Table(name = "PATIENTMEASUREMENTS")
public class PatientMeasurement {
    @Id
    @GeneratedValue
    private Long id;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "patient_id", nullable = false)
    private Patient patient;

    @ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.REFRESH)
    @JoinColumns({
            @JoinColumn(name = "measurementclassifier_code", nullable = false),
            @JoinColumn(name = "measurementclassifier_name", nullable = false)
    })
    private MeasurementClassifier classifier;

    @Temporal(TemporalType.TIMESTAMP)
    private Date date;

    private Double value;

    private Boolean imported;

    public PatientMeasurement() {
    }

    public PatientMeasurement(Patient patient, Date date, MeasurementClassifier classifier, Double value, Boolean imported) {
        this.patient = patient;
        this.date = date;
        this.classifier = classifier;
        this.value = value;
        this.imported = imported;
    }

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

    public MeasurementClassifier getClassifier() {
        return classifier;
    }

    public void setClassifier(MeasurementClassifier classifier) {
        this.classifier = classifier;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Double getValue() {
        return value;
    }

    public void setValue(Double value) {
        this.value = value;
    }

    public Boolean getImported() {
        return imported;
    }

    public void setImported(Boolean imported) {
        this.imported = imported;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        PatientMeasurement that = (PatientMeasurement) o;

        if (classifier != null ? !classifier.equals(that.classifier) : that.classifier != null) return false;
        if (date != null ? !date.equals(that.date) : that.date != null) return false;
        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        if (patient != null ? !patient.equals(that.patient) : that.patient != null) return false;
        if (value != null ? !value.equals(that.value) : that.value != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (patient != null ? patient.hashCode() : 0);
        result = 31 * result + (classifier != null ? classifier.hashCode() : 0);
        result = 31 * result + (date != null ? date.hashCode() : 0);
        result = 31 * result + (value != null ? value.hashCode() : 0);
        return result;
    }
}
