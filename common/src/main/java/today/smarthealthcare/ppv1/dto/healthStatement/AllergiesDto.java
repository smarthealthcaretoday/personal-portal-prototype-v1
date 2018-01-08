package today.smarthealthcare.ppv1.dto.healthStatement;

/**
 * Allergies part of personal health statement DTO
 *
 * @author: Vadim Nesmashnov
 */
public class AllergiesDto {
    private Long id;
    private boolean none;
    private boolean drugs;
    private String drugsDetails;
    private boolean food;
    private String foodDetails;
    private boolean domesticPets;
    private String domesticPetsDetails;
    private boolean pollen;
    private String pollenDetails;
    private boolean other;
    private String otherDetails;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public boolean isNone() {
        return none;
    }

    public void setNone(boolean none) {
        this.none = none;
    }

    public boolean isDrugs() {
        return drugs;
    }

    public void setDrugs(boolean drugs) {
        this.drugs = drugs;
    }

    public String getDrugsDetails() {
        return drugsDetails;
    }

    public void setDrugsDetails(String drugsDetails) {
        this.drugsDetails = drugsDetails;
    }

    public boolean isFood() {
        return food;
    }

    public void setFood(boolean food) {
        this.food = food;
    }

    public String getFoodDetails() {
        return foodDetails;
    }

    public void setFoodDetails(String foodDetails) {
        this.foodDetails = foodDetails;
    }

    public boolean isDomesticPets() {
        return domesticPets;
    }

    public void setDomesticPets(boolean domesticPets) {
        this.domesticPets = domesticPets;
    }

    public String getDomesticPetsDetails() {
        return domesticPetsDetails;
    }

    public void setDomesticPetsDetails(String domesticPetsDetails) {
        this.domesticPetsDetails = domesticPetsDetails;
    }

    public boolean isPollen() {
        return pollen;
    }

    public void setPollen(boolean pollen) {
        this.pollen = pollen;
    }

    public String getPollenDetails() {
        return pollenDetails;
    }

    public void setPollenDetails(String pollenDetails) {
        this.pollenDetails = pollenDetails;
    }

    public boolean isOther() {
        return other;
    }

    public void setOther(boolean other) {
        this.other = other;
    }

    public String getOtherDetails() {
        return otherDetails;
    }

    public void setOtherDetails(String otherDetails) {
        this.otherDetails = otherDetails;
    }
}
