package today.smarthealthcare.ppv1.dto.healthStatement;

/**
 * Live style part of personal health statement DTO
 *
 * @author: Vadim Nesmashnov
 */
public class LifeStyleDto {
    private Long id;
    private boolean alcohol;
    private String alcoholUnits;
    private boolean smoking;
    private String cigarettesPerDay;
    private String smokingYears;
    private String whenQuitSmoking;
    private boolean drugs;
    private String drugsHowOften;
    private boolean medicAffectCoordination;
    private String medicAffectCoordinationDetails;
    private String sleepHabits;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public boolean isAlcohol() {
        return alcohol;
    }

    public void setAlcohol(boolean alcohol) {
        this.alcohol = alcohol;
    }

    public String getAlcoholUnits() {
        return alcoholUnits;
    }

    public void setAlcoholUnits(String alcoholUnits) {
        this.alcoholUnits = alcoholUnits;
    }

    public boolean isSmoking() {
        return smoking;
    }

    public void setSmoking(boolean smoking) {
        this.smoking = smoking;
    }

    public String getCigarettesPerDay() {
        return cigarettesPerDay;
    }

    public void setCigarettesPerDay(String cigarettesPerDay) {
        this.cigarettesPerDay = cigarettesPerDay;
    }

    public String getSmokingYears() {
        return smokingYears;
    }

    public void setSmokingYears(String smokingYears) {
        this.smokingYears = smokingYears;
    }

    public String getWhenQuitSmoking() {
        return whenQuitSmoking;
    }

    public void setWhenQuitSmoking(String whenQuitSmoking) {
        this.whenQuitSmoking = whenQuitSmoking;
    }

    public boolean isDrugs() {
        return drugs;
    }

    public void setDrugs(boolean drugs) {
        this.drugs = drugs;
    }

    public String getDrugsHowOften() {
        return drugsHowOften;
    }

    public void setDrugsHowOften(String drugsHowOften) {
        this.drugsHowOften = drugsHowOften;
    }

    public boolean isMedicAffectCoordination() {
        return medicAffectCoordination;
    }

    public void setMedicAffectCoordination(boolean medicAffectCoordination) {
        this.medicAffectCoordination = medicAffectCoordination;
    }

    public String getMedicAffectCoordinationDetails() {
        return medicAffectCoordinationDetails;
    }

    public void setMedicAffectCoordinationDetails(String medicAffectCoordinationDetails) {
        this.medicAffectCoordinationDetails = medicAffectCoordinationDetails;
    }

    public String getSleepHabits() {
        return sleepHabits;
    }

    public void setSleepHabits(String sleepHabits) {
        this.sleepHabits = sleepHabits;
    }
}
