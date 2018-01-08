package today.smarthealthcare.ppv1.dto.healthStatement;

/**
 * @author: Vadim Nesmashnov
 */
public class OtherChronicDiseasesDto {
    private Long id;
    private boolean noComplains;
    private boolean disease;
    private String diseaseDetails;

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

    public boolean isDisease() {
        return disease;
    }

    public void setDisease(boolean disease) {
        this.disease = disease;
    }

    public String getDiseaseDetails() {
        return diseaseDetails;
    }

    public void setDiseaseDetails(String diseaseDetails) {
        this.diseaseDetails = diseaseDetails;
    }
}
