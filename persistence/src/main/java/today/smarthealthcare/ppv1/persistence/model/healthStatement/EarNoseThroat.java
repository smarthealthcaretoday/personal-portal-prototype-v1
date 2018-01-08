package today.smarthealthcare.ppv1.persistence.model.healthStatement;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Objects;

/**
 * Ear, nose, throat part of personal health statement
 *
 * @author: Vadim Nesmashnov
 */
@Entity
@Table(name = "HEALTHSTATEMENTEARNOSETHROAT")
public class EarNoseThroat {
    @Id
    @GeneratedValue
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        EarNoseThroat that = (EarNoseThroat) o;
        return Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
