package today.smarthealthcare.ppv1.dto.classifier;

import com.google.common.base.MoreObjects;

/**
 * Measurement classifier
 *
 * @author: Vadim Nesmashnov
 */
public class MeasurementClassifierDto extends ClassifierDto implements IClassifierWithUnit {
    public MeasurementClassifierDto() {
    }

    public MeasurementClassifierDto(String code, String name, String unit) {
        super(code, name);
        this.unit = unit;
    }

    private String unit;

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
