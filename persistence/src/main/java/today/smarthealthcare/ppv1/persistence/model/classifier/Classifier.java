package today.smarthealthcare.ppv1.persistence.model.classifier;

import com.google.common.base.MoreObjects;

import javax.persistence.EmbeddedId;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import java.util.Objects;

/**
 * @author: Vadim Nesmashnov
 */
@MappedSuperclass
public class Classifier {
    @EmbeddedId
    private ClassifierId id;

    public ClassifierId getId() {
        return id;
    }

    public void setId(ClassifierId id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return MoreObjects.toStringHelper(this)
                .add("id", id)
                .toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Classifier that = (Classifier) o;
        return Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
