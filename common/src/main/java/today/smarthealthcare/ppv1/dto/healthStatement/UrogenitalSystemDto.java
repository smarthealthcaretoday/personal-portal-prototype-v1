package today.smarthealthcare.ppv1.dto.healthStatement;

/**
 * @author: Vadim Nesmashnov
 */
public class UrogenitalSystemDto {
    private Long id;
    private boolean noComplains;
    private boolean kidneyStones;
    private String kidneyStonesDetails;
    private boolean renalInsufficiency;
    private String renalInsufficiencyDetails;
    private boolean otherDisease;
    private String otherDiseaseDetails;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public boolean isNoComplains() {
        return noComplains;
    }

    public void setNoComplains(boolean noComplains) {
        this.noComplains = noComplains;
    }

    public boolean isKidneyStones() {
        return kidneyStones;
    }

    public void setKidneyStones(boolean kidneyStones) {
        this.kidneyStones = kidneyStones;
    }

    public String getKidneyStonesDetails() {
        return kidneyStonesDetails;
    }

    public void setKidneyStonesDetails(String kidneyStonesDetails) {
        this.kidneyStonesDetails = kidneyStonesDetails;
    }

    public boolean isRenalInsufficiency() {
        return renalInsufficiency;
    }

    public void setRenalInsufficiency(boolean renalInsufficiency) {
        this.renalInsufficiency = renalInsufficiency;
    }

    public String getRenalInsufficiencyDetails() {
        return renalInsufficiencyDetails;
    }

    public void setRenalInsufficiencyDetails(String renalInsufficiencyDetails) {
        this.renalInsufficiencyDetails = renalInsufficiencyDetails;
    }

    public boolean isOtherDisease() {
        return otherDisease;
    }

    public void setOtherDisease(boolean otherDisease) {
        this.otherDisease = otherDisease;
    }

    public String getOtherDiseaseDetails() {
        return otherDiseaseDetails;
    }

    public void setOtherDiseaseDetails(String otherDiseaseDetails) {
        this.otherDiseaseDetails = otherDiseaseDetails;
    }
}
