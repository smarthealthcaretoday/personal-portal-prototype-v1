package today.smarthealthcare.ppv1.dto.healthStatement;

/**
 * @author: Vadim Nesmashnov
 */
public class MentalHealthDto {
    private Long id;
    private boolean noComplains;
    private boolean depression;
    private String depressionDetails;
    private boolean schizophrenia;
    private String schizophreniaDetails;
    private boolean fearOfWorkingAlone;
    private String fearOfWorkingAloneDetails;
    private boolean fearOfClosedSpaces;
    private String fearOfClosedSpacesDetails;
    private boolean fearOfHeights;
    private String fearOfHeightsDetails;
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

    public boolean isDepression() {
        return depression;
    }

    public void setDepression(boolean depression) {
        this.depression = depression;
    }

    public String getDepressionDetails() {
        return depressionDetails;
    }

    public void setDepressionDetails(String depressionDetails) {
        this.depressionDetails = depressionDetails;
    }

    public boolean isSchizophrenia() {
        return schizophrenia;
    }

    public void setSchizophrenia(boolean schizophrenia) {
        this.schizophrenia = schizophrenia;
    }

    public String getSchizophreniaDetails() {
        return schizophreniaDetails;
    }

    public void setSchizophreniaDetails(String schizophreniaDetails) {
        this.schizophreniaDetails = schizophreniaDetails;
    }

    public boolean isFearOfWorkingAlone() {
        return fearOfWorkingAlone;
    }

    public void setFearOfWorkingAlone(boolean fearOfWorkingAlone) {
        this.fearOfWorkingAlone = fearOfWorkingAlone;
    }

    public String getFearOfWorkingAloneDetails() {
        return fearOfWorkingAloneDetails;
    }

    public void setFearOfWorkingAloneDetails(String fearOfWorkingAloneDetails) {
        this.fearOfWorkingAloneDetails = fearOfWorkingAloneDetails;
    }

    public boolean isFearOfClosedSpaces() {
        return fearOfClosedSpaces;
    }

    public void setFearOfClosedSpaces(boolean fearOfClosedSpaces) {
        this.fearOfClosedSpaces = fearOfClosedSpaces;
    }

    public String getFearOfClosedSpacesDetails() {
        return fearOfClosedSpacesDetails;
    }

    public void setFearOfClosedSpacesDetails(String fearOfClosedSpacesDetails) {
        this.fearOfClosedSpacesDetails = fearOfClosedSpacesDetails;
    }

    public boolean isFearOfHeights() {
        return fearOfHeights;
    }

    public void setFearOfHeights(boolean fearOfHeights) {
        this.fearOfHeights = fearOfHeights;
    }

    public String getFearOfHeightsDetails() {
        return fearOfHeightsDetails;
    }

    public void setFearOfHeightsDetails(String fearOfHeightsDetails) {
        this.fearOfHeightsDetails = fearOfHeightsDetails;
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
