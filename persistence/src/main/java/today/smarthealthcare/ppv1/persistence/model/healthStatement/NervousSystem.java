package today.smarthealthcare.ppv1.persistence.model.healthStatement;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Objects;

/**
 * Nervous system part of personal health statement
 *
 * @author: Vadim Nesmashnov
 */
@Entity
@Table(name = "HEALTHSTATEMENTNERVOUSSYSTEM")
public class NervousSystem {
    @Id
    @GeneratedValue
    private Long id;
    private boolean noComplains;
    private boolean faintingSpells;
    private String faintingSpellsDetails;
    private boolean convulsions;
    private String convulsionsDetails;
    private boolean balanceDisorders;
    private String balanceDisordersDetails;
    private boolean cerebralInfarction;
    private String cerebralInfarctionDetails;
    private boolean seasickness;
    private String seasicknessDetails;
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

    public boolean isFaintingSpells() {
        return faintingSpells;
    }

    public void setFaintingSpells(boolean faintingSpells) {
        this.faintingSpells = faintingSpells;
    }

    public String getFaintingSpellsDetails() {
        return faintingSpellsDetails;
    }

    public void setFaintingSpellsDetails(String faintingSpellsDetails) {
        this.faintingSpellsDetails = faintingSpellsDetails;
    }

    public boolean isConvulsions() {
        return convulsions;
    }

    public void setConvulsions(boolean convulsions) {
        this.convulsions = convulsions;
    }

    public String getConvulsionsDetails() {
        return convulsionsDetails;
    }

    public void setConvulsionsDetails(String convulsionsDetails) {
        this.convulsionsDetails = convulsionsDetails;
    }

    public boolean isBalanceDisorders() {
        return balanceDisorders;
    }

    public void setBalanceDisorders(boolean balanceDisorders) {
        this.balanceDisorders = balanceDisorders;
    }

    public String getBalanceDisordersDetails() {
        return balanceDisordersDetails;
    }

    public void setBalanceDisordersDetails(String balanceDisordersDetails) {
        this.balanceDisordersDetails = balanceDisordersDetails;
    }

    public boolean isCerebralInfarction() {
        return cerebralInfarction;
    }

    public void setCerebralInfarction(boolean cerebralInfarction) {
        this.cerebralInfarction = cerebralInfarction;
    }

    public String getCerebralInfarctionDetails() {
        return cerebralInfarctionDetails;
    }

    public void setCerebralInfarctionDetails(String cerebralInfarctionDetails) {
        this.cerebralInfarctionDetails = cerebralInfarctionDetails;
    }

    public boolean isSeasickness() {
        return seasickness;
    }

    public void setSeasickness(boolean seasickness) {
        this.seasickness = seasickness;
    }

    public String getSeasicknessDetails() {
        return seasicknessDetails;
    }

    public void setSeasicknessDetails(String seasicknessDetails) {
        this.seasicknessDetails = seasicknessDetails;
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
        NervousSystem that = (NervousSystem) o;
        return Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
