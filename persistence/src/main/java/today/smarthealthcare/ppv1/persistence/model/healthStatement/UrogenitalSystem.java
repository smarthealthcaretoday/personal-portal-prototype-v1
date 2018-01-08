package today.smarthealthcare.ppv1.persistence.model.healthStatement;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Objects;

/**
 * Urogenital system part of personal health statement
 *
 * @author: Vadim Nesmashnov
 */
@Entity
@Table(name = "HEALTHSTATEMENTUROGENITALSYSTEM")
public class UrogenitalSystem {
    @Id
    @GeneratedValue
    private Long id;
    private boolean noComplains;
    private boolean kidneyStones;
    private String kidneyStonesDetails;
    private boolean renalInsufficiency;
    private String renalInsufficiencyDetails;
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

    public boolean isKidneyStones() {
        return kidneyStones;
    }

    public void setKidneyStones(boolean kidneyStones) {
        this.kidneyStones = kidneyStones;
    }

    public String getKidneyStonesDetails() {
        return kidneyStonesDetails;
    }

    public void setKidneyStonesDetails(String kidneyStonesDetails) {
        this.kidneyStonesDetails = kidneyStonesDetails;
    }

    public boolean isRenalInsufficiency() {
        return renalInsufficiency;
    }

    public void setRenalInsufficiency(boolean renalInsufficiency) {
        this.renalInsufficiency = renalInsufficiency;
    }

    public String getRenalInsufficiencyDetails() {
        return renalInsufficiencyDetails;
    }

    public void setRenalInsufficiencyDetails(String renalInsufficiencyDetails) {
        this.renalInsufficiencyDetails = renalInsufficiencyDetails;
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
        UrogenitalSystem that = (UrogenitalSystem) o;
        return Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
