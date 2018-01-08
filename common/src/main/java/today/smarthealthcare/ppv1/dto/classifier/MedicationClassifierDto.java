package today.smarthealthcare.ppv1.dto.classifier;

import com.google.common.base.MoreObjects;

/**
 * Medication classifier
 *
 * @author: Vadim Nesmashnov
 */
public class MedicationClassifierDto extends ClassifierDto implements IClassifierWithUnit{
    private String unit;

    public MedicationClassifierDto() {
    }

    public MedicationClassifierDto(String code, String name, String unit) {
        super(code, name);
        this.unit = unit;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    @Override
    public String toString() {
        return MoreObjects.toStringHelper(this)
                .add("unit", unit)
                .toString();
    }
}
