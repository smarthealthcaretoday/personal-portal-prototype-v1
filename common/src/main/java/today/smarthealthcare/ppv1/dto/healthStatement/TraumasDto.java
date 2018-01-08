package today.smarthealthcare.ppv1.dto.healthStatement;

/**
 * @author: Vadim Nesmashnov
 */
public class TraumasDto {
    private Long id;
    private boolean noComplains;
    private boolean boneFractures;
    private String boneFracturesDetails;
    private boolean otherInjuries;
    private String otherInjuriesDetails;

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

    public boolean isBoneFractures() {
        return boneFractures;
    }

    public void setBoneFractures(boolean boneFractures) {
        this.boneFractures = boneFractures;
    }

    public String getBoneFracturesDetails() {
        return boneFracturesDetails;
    }

    public void setBoneFracturesDetails(String boneFracturesDetails) {
        this.boneFracturesDetails = boneFracturesDetails;
    }

    public boolean isOtherInjuries() {
        return otherInjuries;
    }

    public void setOtherInjuries(boolean otherInjuries) {
        this.otherInjuries = otherInjuries;
    }

    public String getOtherInjuriesDetails() {
        return otherInjuriesDetails;
    }

    public void setOtherInjuriesDetails(String otherInjuriesDetails) {
        this.otherInjuriesDetails = otherInjuriesDetails;
    }
}
