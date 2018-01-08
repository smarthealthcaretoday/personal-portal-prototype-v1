package today.smarthealthcare.ppv1.dto.healthStatement;

/**
 * @author: Vadim Nesmashnov
 */
public class TreatmentUpToNowDto {
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
}
