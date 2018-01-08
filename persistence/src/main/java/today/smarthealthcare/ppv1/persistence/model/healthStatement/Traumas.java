package today.smarthealthcare.ppv1.persistence.model.healthStatement;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Objects;

/**
 * Traumas part of personal health statement
 *
 * @author: Vadim Nesmashnov
 */
@Entity
@Table(name = "HEALTHSTATEMENTTRAUMAS")
public class Traumas {
    @Id
    @GeneratedValue
    private Long id;
    private boolean noComplains;
    private boolean boneFractures;
    private String boneFracturesDetails;
    private boolean otherInjuries;
    private String otherInjuriesDetails;

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

    public boolean isBoneFractures() {
        return boneFractures;
    }

    public void setBoneFractures(boolean boneFractures) {
        this.boneFractures = boneFractures;
    }

    public String getBoneFracturesDetails() {
        return boneFracturesDetails;
    }

    public void setBoneFracturesDetails(String boneFracturesDetails) {
        this.boneFracturesDetails = boneFracturesDetails;
    }

    public boolean isOtherInjuries() {
        return otherInjuries;
    }

    public void setOtherInjuries(boolean otherInjuries) {
        this.otherInjuries = otherInjuries;
    }

    public String getOtherInjuriesDetails() {
        return otherInjuriesDetails;
    }

    public void setOtherInjuriesDetails(String otherInjuriesDetails) {
        this.otherInjuriesDetails = otherInjuriesDetails;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Traumas that = (Traumas) o;
        return Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
