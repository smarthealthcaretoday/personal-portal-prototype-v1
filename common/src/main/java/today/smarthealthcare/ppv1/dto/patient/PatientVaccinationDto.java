package today.smarthealthcare.ppv1.dto.patient;

import today.smarthealthcare.ppv1.dto.classifier.VaccineClassifierDto;
import com.google.common.base.MoreObjects;

import java.io.Serializable;
import java.util.Date;

/**
 * Patient vaccination DTO
 *
 * @author: Vadim Nesmashnov
 */
public class PatientVaccinationDto implements Serializable {
    private Long id;
    private VaccineClassifierDto classifier;
    private Date startDate;
    private Date endDate;
    private String dose;
    private String strength;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public VaccineClassifierDto getClassifier() {
        return classifier;
    }

    public void setClassifier(VaccineClassifierDto classifier) {
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

    public String getDose() {
        return dose;
    }

    public void setDose(String dose) {
        this.dose = dose;
    }

    public String getStrength() {
        return strength;
    }

    public void setStrength(String strength) {
        this.strength = strength;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        PatientVaccinationDto that = (PatientVaccinationDto) o;

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
                .add("dose", dose)
                .add("strength", strength)
                .toString();
    }
}
