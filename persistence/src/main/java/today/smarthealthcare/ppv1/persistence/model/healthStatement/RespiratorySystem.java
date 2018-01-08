package today.smarthealthcare.ppv1.persistence.model.healthStatement;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Objects;

/**
 * Respiratory system part of personal health statement
 *
 * @author: Vadim Nesmashnov
 */
@Entity
@Table(name = "HEALTHSTATEMENTRESPIRATORYSYSTEM")
public class RespiratorySystem {
    @Id
    @GeneratedValue
    private Long id;
    private boolean noComplains;
    private boolean asthma;
    private String asthmaDetails;
    private boolean copd;
    private String copdDetails;
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

    public boolean isAsthma() {
        return asthma;
    }

    public void setAsthma(boolean asthma) {
        this.asthma = asthma;
    }

    public String getAsthmaDetails() {
        return asthmaDetails;
    }

    public void setAsthmaDetails(String asthmaDetails) {
        this.asthmaDetails = asthmaDetails;
    }

    public boolean isCopd() {
        return copd;
    }

    public void setCopd(boolean copd) {
        this.copd = copd;
    }

    public String getCopdDetails() {
        return copdDetails;
    }

    public void setCopdDetails(String copdDetails) {
        this.copdDetails = copdDetails;
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
        RespiratorySystem that = (RespiratorySystem) o;
        return Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}

