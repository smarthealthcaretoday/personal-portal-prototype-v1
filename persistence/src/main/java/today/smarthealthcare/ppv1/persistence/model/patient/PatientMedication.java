package today.smarthealthcare.ppv1.persistence.model.patient;

import today.smarthealthcare.ppv1.persistence.model.classifier.MedicationClassifier;

import javax.persistence.*;
import java.util.Date;

import today.smarthealthcare.ppv1.persistence.model.classifier.MedicationClassifier;

/**
 * @author: Vadim Nesmashnov
 */
@Entity
@Table(name = "PATIENTMEDICATIONS")
public class PatientMedication {
    @Id
    @GeneratedValue
    private Long id;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "patient_id", nullable = false)
    private Patient patient;

    @ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.REFRESH)
    @JoinColumns({
            @JoinColumn(name = "medicationclassifier_code", nullable = false),
            @JoinColumn(name = "medicationclassifier_name", nullable = false)
    })
    private MedicationClassifier classifier;

    @Temporal(TemporalType.TIMESTAMP)
    private Date startDate;

    @Temporal(TemporalType.TIMESTAMP)
    private Date endDate;

    private String strength;

    private String dosage;

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

    public MedicationClassifier getClassifier() {
        return classifier;
    }

    public void setClassifier(MedicationClassifier classifier) {
        this.classifier = classifier;
    }

    public String getStrength() {
        return strength;
    }

    public void setStrength(String strength) {
        this.strength = strength;
    }

    public String getDosage() {
        return dosage;
    }

    public void setDosage(String dosage) {
        this.dosage = dosage;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        PatientMedication that = (PatientMedication) o;

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
