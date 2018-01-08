package today.smarthealthcare.ppv1.dto.healthStatement;

/**
 * @author: Vadim Nesmashnov
 */
public class DigestiveOrgansDto {
    private Long id;
    private boolean noComplains;
    private boolean liverDisease;
    private String liverDiseaseDetails;
    private boolean gallstones;
    private String gallstonesDetails;
    private boolean gastricDuodenalUlcers;
    private String gastricDuodenalUlcersDetails;
    private boolean ulcerativeColitis;
    private String ulcerativeColitisDetails;
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

    public boolean isLiverDisease() {
        return liverDisease;
    }

    public void setLiverDisease(boolean liverDisease) {
        this.liverDisease = liverDisease;
    }

    public String getLiverDiseaseDetails() {
        return liverDiseaseDetails;
    }

    public void setLiverDiseaseDetails(String liverDiseaseDetails) {
        this.liverDiseaseDetails = liverDiseaseDetails;
    }

    public boolean isGallstones() {
        return gallstones;
    }

    public void setGallstones(boolean gallstones) {
        this.gallstones = gallstones;
    }

    public String getGallstonesDetails() {
        return gallstonesDetails;
    }

    public void setGallstonesDetails(String gallstonesDetails) {
        this.gallstonesDetails = gallstonesDetails;
    }

    public boolean isGastricDuodenalUlcers() {
        return gastricDuodenalUlcers;
    }

    public void setGastricDuodenalUlcers(boolean gastricDuodenalUlcers) {
        this.gastricDuodenalUlcers = gastricDuodenalUlcers;
    }

    public String getGastricDuodenalUlcersDetails() {
        return gastricDuodenalUlcersDetails;
    }

    public void setGastricDuodenalUlcersDetails(String gastricDuodenalUlcersDetails) {
        this.gastricDuodenalUlcersDetails = gastricDuodenalUlcersDetails;
    }

    public boolean isUlcerativeColitis() {
        return ulcerativeColitis;
    }

    public void setUlcerativeColitis(boolean ulcerativeColitis) {
        this.ulcerativeColitis = ulcerativeColitis;
    }

    public String getUlcerativeColitisDetails() {
        return ulcerativeColitisDetails;
    }

    public void setUlcerativeColitisDetails(String ulcerativeColitisDetails) {
        this.ulcerativeColitisDetails = ulcerativeColitisDetails;
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
