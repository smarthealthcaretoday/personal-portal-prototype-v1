package today.smarthealthcare.ppv1.dto.healthStatement;

/**
 * @author: Vadim Nesmashnov
 */
public class SkinDisordersDto {
    private Long id;
    private boolean skinDisorders;
    private String skinDisordersDetails;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public boolean isSkinDisorders() {
        return skinDisorders;
    }

    public void setSkinDisorders(boolean skinDisorders) {
        this.skinDisorders = skinDisorders;
    }

    public String getSkinDisordersDetails() {
        return skinDisordersDetails;
    }

    public void setSkinDisordersDetails(String skinDisordersDetails) {
        this.skinDisordersDetails = skinDisordersDetails;
    }
}
