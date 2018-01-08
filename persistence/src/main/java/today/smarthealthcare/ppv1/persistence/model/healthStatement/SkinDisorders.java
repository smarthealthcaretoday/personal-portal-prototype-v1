package today.smarthealthcare.ppv1.persistence.model.healthStatement;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Objects;

/**
 * Skin disorders part of personal health statement
 *
 * @author: Vadim Nesmashnov
 */
@Entity
@Table(name = "HEALTHSTATEMENTSKINDISORDERS")
public class SkinDisorders {
    @Id
    @GeneratedValue
    private Long id;
    private boolean skinDisorders;
    private String skinDisordersDetails;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public boolean isSkinDisorders() {
        return skinDisorders;
    }

    public void setSkinDisorders(boolean skinDisorders) {
        this.skinDisorders = skinDisorders;
    }

    public String getSkinDisordersDetails() {
        return skinDisordersDetails;
    }

    public void setSkinDisordersDetails(String skinDisordersDetails) {
        this.skinDisordersDetails = skinDisordersDetails;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SkinDisorders that = (SkinDisorders) o;
        return Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
