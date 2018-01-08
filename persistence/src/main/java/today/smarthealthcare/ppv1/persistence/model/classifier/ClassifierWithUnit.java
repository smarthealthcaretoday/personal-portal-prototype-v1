package today.smarthealthcare.ppv1.persistence.model.classifier;

import javax.persistence.MappedSuperclass;

/**
 * @author: Vadim Nesmashnov
 */
@MappedSuperclass
public class ClassifierWithUnit extends Classifier {
    private String unit;

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }
}
