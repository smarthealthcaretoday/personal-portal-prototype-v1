package today.smarthealthcare.ppv1.persistence.model.healthStatement;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Objects;

/**
 * Metabolic disorders part of personal health statement
 *
 * @author: Vadim Nesmashnov
 */
@Entity
@Table(name = "HEALTHSTATEMENTMETABOLICDISORDERS")
public class MetabolicDisorders {
    @Id
    @GeneratedValue
    private Long id;
    private boolean noComplains;
    private boolean diabetes;
    private String diabetesDetails;
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

    public boolean isDiabetes() {
        return diabetes;
    }

    public void setDiabetes(boolean diabetes) {
        this.diabetes = diabetes;
    }

    public String getDiabetesDetails() {
        return diabetesDetails;
    }

    public void setDiabetesDetails(String diabetesDetails) {
        this.diabetesDetails = diabetesDetails;
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
        MetabolicDisorders that = (MetabolicDisorders) o;
        return Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
