package today.smarthealthcare.ppv1.dto.healthStatement;

/**
 * Blood problems part of personal health statement DTO
 *
 * @author: Vadim Nesmashnov
 */
public class BloodProblemsDto {
    private Long id;
    private boolean noComplains;
    private boolean anemia;
    private String anemiaDetails;
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

    public boolean isAnemia() {
        return anemia;
    }

    public void setAnemia(boolean anemia) {
        this.anemia = anemia;
    }

    public String getAnemiaDetails() {
        return anemiaDetails;
    }

    public void setAnemiaDetails(String anemiaDetails) {
        this.anemiaDetails = anemiaDetails;
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
