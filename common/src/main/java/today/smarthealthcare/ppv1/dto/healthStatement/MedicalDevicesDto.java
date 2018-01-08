package today.smarthealthcare.ppv1.dto.healthStatement;

/**
 * Medical devices part of personal health statement DTO
 *
 * @author: Vadim Nesmashnov
 */
public class MedicalDevicesDto {
    private Long id;
    private boolean none;
    private boolean glasses;
    private String glassesDetails;
    private boolean contactLenses;
    private String contactLensesDetails;
    private boolean hearingAid;
    private String hearingAidDetails;
    private boolean legProsthesis;
    private String legProsthesisDetails;
    private boolean armProsthesis;
    private String armProsthesisDetails;
    private boolean mobilitySupportDevice;
    private String mobilitySupportDeviceDetails;
    private boolean otherDevice;
    private String otherDeviceDetails;

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

    public boolean isGlasses() {
        return glasses;
    }

    public void setGlasses(boolean glasses) {
        this.glasses = glasses;
    }

    public String getGlassesDetails() {
        return glassesDetails;
    }

    public void setGlassesDetails(String glassesDetails) {
        this.glassesDetails = glassesDetails;
    }

    public boolean isContactLenses() {
        return contactLenses;
    }

    public void setContactLenses(boolean contactLenses) {
        this.contactLenses = contactLenses;
    }

    public String getContactLensesDetails() {
        return contactLensesDetails;
    }

    public void setContactLensesDetails(String contactLensesDetails) {
        this.contactLensesDetails = contactLensesDetails;
    }

    public boolean isHearingAid() {
        return hearingAid;
    }

    public void setHearingAid(boolean hearingAid) {
        this.hearingAid = hearingAid;
    }

    public String getHearingAidDetails() {
        return hearingAidDetails;
    }

    public void setHearingAidDetails(String hearingAidDetails) {
        this.hearingAidDetails = hearingAidDetails;
    }

    public boolean isLegProsthesis() {
        return legProsthesis;
    }

    public void setLegProsthesis(boolean legProsthesis) {
        this.legProsthesis = legProsthesis;
    }

    public String getLegProsthesisDetails() {
        return legProsthesisDetails;
    }

    public void setLegProsthesisDetails(String legProsthesisDetails) {
        this.legProsthesisDetails = legProsthesisDetails;
    }

    public boolean isArmProsthesis() {
        return armProsthesis;
    }

    public void setArmProsthesis(boolean armProsthesis) {
        this.armProsthesis = armProsthesis;
    }

    public String getArmProsthesisDetails() {
        return armProsthesisDetails;
    }

    public void setArmProsthesisDetails(String armProsthesisDetails) {
        this.armProsthesisDetails = armProsthesisDetails;
    }

    public boolean isMobilitySupportDevice() {
        return mobilitySupportDevice;
    }

    public void setMobilitySupportDevice(boolean mobilitySupportDevice) {
        this.mobilitySupportDevice = mobilitySupportDevice;
    }

    public String getMobilitySupportDeviceDetails() {
        return mobilitySupportDeviceDetails;
    }

    public void setMobilitySupportDeviceDetails(String mobilitySupportDeviceDetails) {
        this.mobilitySupportDeviceDetails = mobilitySupportDeviceDetails;
    }

    public boolean isOtherDevice() {
        return otherDevice;
    }

    public void setOtherDevice(boolean otherDevice) {
        this.otherDevice = otherDevice;
    }

    public String getOtherDeviceDetails() {
        return otherDeviceDetails;
    }

    public void setOtherDeviceDetails(String otherDeviceDetails) {
        this.otherDeviceDetails = otherDeviceDetails;
    }
}
