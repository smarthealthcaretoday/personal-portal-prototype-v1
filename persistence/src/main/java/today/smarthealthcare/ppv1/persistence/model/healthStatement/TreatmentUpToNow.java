package today.smarthealthcare.ppv1.persistence.model.healthStatement;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Objects;

/**
 * Treatment up to now part of personal health statement
 *
 * @author: Vadim Nesmashnov
 */
@Entity
@Table(name = "HEALTHSTATEMENTTREATMENTUPTONOW")
public class TreatmentUpToNow {
    @Id
    @GeneratedValue
    private Long id;
    private boolean visitedDoctorAbroad;
    private String visitedDoctorAbroadDetails;
    private boolean regularlMedication;
    private String regularlMedicationDetails;
    private boolean hospitalized;
    private String hospitalizedDetails;
    private boolean surgery;
    private String surgeryDetails;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public boolean isVisitedDoctorAbroad() {
        return visitedDoctorAbroad;
    }

    public void setVisitedDoctorAbroad(boolean visitedDoctorAbroad) {
        this.visitedDoctorAbroad = visitedDoctorAbroad;
    }

    public String getVisitedDoctorAbroadDetails() {
        return visitedDoctorAbroadDetails;
    }

    public void setVisitedDoctorAbroadDetails(String visitedDoctorAbroadDetails) {
        this.visitedDoctorAbroadDetails = visitedDoctorAbroadDetails;
    }

    public boolean isRegularlMedication() {
        return regularlMedication;
    }

    public void setRegularlMedication(boolean regularlMedication) {
        this.regularlMedication = regularlMedication;
    }

    public String getRegularlMedicationDetails() {
        return regularlMedicationDetails;
    }

    public void setRegularlMedicationDetails(String regularlMedicationDetails) {
        this.regularlMedicationDetails = regularlMedicationDetails;
    }

    public boolean isHospitalized() {
        return hospitalized;
    }

    public void setHospitalized(boolean hospitalized) {
        this.hospitalized = hospitalized;
    }

    public String getHospitalizedDetails() {
        return hospitalizedDetails;
    }

    public void setHospitalizedDetails(String hospitalizedDetails) {
        this.hospitalizedDetails = hospitalizedDetails;
    }

    public boolean isSurgery() {
        return surgery;
    }

    public void setSurgery(boolean surgery) {
        this.surgery = surgery;
    }

    public String getSurgeryDetails() {
        return surgeryDetails;
    }

    public void setSurgeryDetails(String surgeryDetails) {
        this.surgeryDetails = surgeryDetails;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TreatmentUpToNow that = (TreatmentUpToNow) o;
        return Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
