package today.smarthealthcare.ppv1.dto.healthStatement;

/**
 * @author: Vadim Nesmashnov
 */
public class RespiratorySystemDto {
    private Long id;
    private boolean noComplains;
    private boolean asthma;
    private String asthmaDetails;
    private boolean copd;
    private String copdDetails;
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

    public boolean isAsthma() {
        return asthma;
    }

    public void setAsthma(boolean asthma) {
        this.asthma = asthma;
    }

    public String getAsthmaDetails() {
        return asthmaDetails;
    }

    public void setAsthmaDetails(String asthmaDetails) {
        this.asthmaDetails = asthmaDetails;
    }

    public boolean isCopd() {
        return copd;
    }

    public void setCopd(boolean copd) {
        this.copd = copd;
    }

    public String getCopdDetails() {
        return copdDetails;
    }

    public void setCopdDetails(String copdDetails) {
        this.copdDetails = copdDetails;
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
