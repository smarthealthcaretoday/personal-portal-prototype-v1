package today.smarthealthcare.ppv1.dto.patient;

import today.smarthealthcare.ppv1.dto.classifier.MedicationClassifierDto;
import com.google.common.base.MoreObjects;

import java.io.Serializable;
import java.util.Date;

/**
 * Patient medication DTO
 *
 * @author: Vadim Nesmashnov
 */
public class PatientMedicationDto implements Serializable {
    private Long id;
    private MedicationClassifierDto classifier;
    private Date startDate;
    private Date endDate;
    private String strength;
    private String dosage;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public MedicationClassifierDto getClassifier() {
        return classifier;
    }

    public void setClassifier(MedicationClassifierDto classifier) {
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

        PatientMedicationDto that = (PatientMedicationDto) o;

        if (!id.equals(that.id)) return false;

        return true;
    }

    @Override
    public int hashCode() {
        return id.hashCode();
    }

    @Override
    public String toString() {
        return MoreObjects.toStringHelper(this)
                .add("id", id)
                .add("classifier", classifier)
                .add("startDate", startDate)
                .add("endDate", endDate)
                .add("strength", strength)
                .add("dosage", dosage)
                .toString();
    }
}
