package today.smarthealthcare.ppv1.dto.healthStatement;

/**
 * @author: Vadim Nesmashnov
 */
public class InfectiousDiseasesDto {
    private Long id;
    private boolean noComplains;
    private boolean tuberculosis;
    private String tuberculosisDetails;
    private boolean viirushepatiit;
    private String viirushepatiitDetails;
    private boolean hivCarrier;
    private String hivCarrierDetails;
    private boolean aids;
    private String aidsDetails;
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

    public boolean isTuberculosis() {
        return tuberculosis;
    }

    public void setTuberculosis(boolean tuberculosis) {
        this.tuberculosis = tuberculosis;
    }

    public String getTuberculosisDetails() {
        return tuberculosisDetails;
    }

    public void setTuberculosisDetails(String tuberculosisDetails) {
        this.tuberculosisDetails = tuberculosisDetails;
    }

    public boolean isViirushepatiit() {
        return viirushepatiit;
    }

    public void setViirushepatiit(boolean viirushepatiit) {
        this.viirushepatiit = viirushepatiit;
    }

    public String getViirushepatiitDetails() {
        return viirushepatiitDetails;
    }

    public void setViirushepatiitDetails(String viirushepatiitDetails) {
        this.viirushepatiitDetails = viirushepatiitDetails;
    }

    public boolean isHivCarrier() {
        return hivCarrier;
    }

    public void setHivCarrier(boolean hivCarrier) {
        this.hivCarrier = hivCarrier;
    }

    public String getHivCarrierDetails() {
        return hivCarrierDetails;
    }

    public void setHivCarrierDetails(String hivCarrierDetails) {
        this.hivCarrierDetails = hivCarrierDetails;
    }

    public boolean isAids() {
        return aids;
    }

    public void setAids(boolean aids) {
        this.aids = aids;
    }

    public String getAidsDetails() {
        return aidsDetails;
    }

    public void setAidsDetails(String aidsDetails) {
        this.aidsDetails = aidsDetails;
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
