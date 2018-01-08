package today.smarthealthcare.ppv1.dto.healthStatement;

/**
 * @author: Vadim Nesmashnov
 */
public class EarNoseThroatDto {
    private Long id;
    private boolean noComplains;
    private boolean hearingLoss;
    private String hearingLossDetails;
    private boolean allergicRhinitis;
    private String allergicRhinitisDetails;
    private boolean chronicSinusitis;
    private String chronicSinusitisDetails;
    private boolean nasalObstruction;
    private String nasalObstructionDetails;
    private boolean frequentHhroatProblems;
    private String frequentHhroatProblemsDetails;
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

    public boolean isHearingLoss() {
        return hearingLoss;
    }

    public void setHearingLoss(boolean hearingLoss) {
        this.hearingLoss = hearingLoss;
    }

    public String getHearingLossDetails() {
        return hearingLossDetails;
    }

    public void setHearingLossDetails(String hearingLossDetails) {
        this.hearingLossDetails = hearingLossDetails;
    }

    public boolean isAllergicRhinitis() {
        return allergicRhinitis;
    }

    public void setAllergicRhinitis(boolean allergicRhinitis) {
        this.allergicRhinitis = allergicRhinitis;
    }

    public String getAllergicRhinitisDetails() {
        return allergicRhinitisDetails;
    }

    public void setAllergicRhinitisDetails(String allergicRhinitisDetails) {
        this.allergicRhinitisDetails = allergicRhinitisDetails;
    }

    public boolean isChronicSinusitis() {
        return chronicSinusitis;
    }

    public void setChronicSinusitis(boolean chronicSinusitis) {
        this.chronicSinusitis = chronicSinusitis;
    }

    public String getChronicSinusitisDetails() {
        return chronicSinusitisDetails;
    }

    public void setChronicSinusitisDetails(String chronicSinusitisDetails) {
        this.chronicSinusitisDetails = chronicSinusitisDetails;
    }

    public boolean isNasalObstruction() {
        return nasalObstruction;
    }

    public void setNasalObstruction(boolean nasalObstruction) {
        this.nasalObstruction = nasalObstruction;
    }

    public String getNasalObstructionDetails() {
        return nasalObstructionDetails;
    }

    public void setNasalObstructionDetails(String nasalObstructionDetails) {
        this.nasalObstructionDetails = nasalObstructionDetails;
    }

    public boolean isFrequentHhroatProblems() {
        return frequentHhroatProblems;
    }

    public void setFrequentHhroatProblems(boolean frequentHhroatProblems) {
        this.frequentHhroatProblems = frequentHhroatProblems;
    }

    public String getFrequentHhroatProblemsDetails() {
        return frequentHhroatProblemsDetails;
    }

    public void setFrequentHhroatProblemsDetails(String frequentHhroatProblemsDetails) {
        this.frequentHhroatProblemsDetails = frequentHhroatProblemsDetails;
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
