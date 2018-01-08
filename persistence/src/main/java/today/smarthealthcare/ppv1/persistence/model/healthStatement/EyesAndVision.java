package today.smarthealthcare.ppv1.persistence.model.healthStatement;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Objects;

/**
 * Etes and vision part of personal health statement
 *
 * @author: Vadim Nesmashnov
 */
@Entity
@Table(name = "HEALTHSTATEMENTEYESANDVISION")
public class EyesAndVision {
    @Id
    @GeneratedValue
    private Long id;
    private boolean noComplains;
    private boolean shortsightedness;
    private String shortsightednessDetails;
    private boolean visualFieldRestriction;
    private String visualFieldRestrictionDetails;
    private boolean doubleVision;
    private String doubleVisionDetails;
    private boolean colourVisionDisorders;
    private String colourVisionDisordersDetails;
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

    public boolean isShortsightedness() {
        return shortsightedness;
    }

    public void setShortsightedness(boolean shortsightedness) {
        this.shortsightedness = shortsightedness;
    }

    public String getShortsightednessDetails() {
        return shortsightednessDetails;
    }

    public void setShortsightednessDetails(String shortsightednessDetails) {
        this.shortsightednessDetails = shortsightednessDetails;
    }

    public boolean isVisualFieldRestriction() {
        return visualFieldRestriction;
    }

    public void setVisualFieldRestriction(boolean visualFieldRestriction) {
        this.visualFieldRestriction = visualFieldRestriction;
    }

    public String getVisualFieldRestrictionDetails() {
        return visualFieldRestrictionDetails;
    }

    public void setVisualFieldRestrictionDetails(String visualFieldRestrictionDetails) {
        this.visualFieldRestrictionDetails = visualFieldRestrictionDetails;
    }

    public boolean isDoubleVision() {
        return doubleVision;
    }

    public void setDoubleVision(boolean doubleVision) {
        this.doubleVision = doubleVision;
    }

    public String getDoubleVisionDetails() {
        return doubleVisionDetails;
    }

    public void setDoubleVisionDetails(String doubleVisionDetails) {
        this.doubleVisionDetails = doubleVisionDetails;
    }

    public boolean isColourVisionDisorders() {
        return colourVisionDisorders;
    }

    public void setColourVisionDisorders(boolean colourVisionDisorders) {
        this.colourVisionDisorders = colourVisionDisorders;
    }

    public String getColourVisionDisordersDetails() {
        return colourVisionDisordersDetails;
    }

    public void setColourVisionDisordersDetails(String colourVisionDisordersDetails) {
        this.colourVisionDisordersDetails = colourVisionDisordersDetails;
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
        EyesAndVision that = (EyesAndVision) o;
        return Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
