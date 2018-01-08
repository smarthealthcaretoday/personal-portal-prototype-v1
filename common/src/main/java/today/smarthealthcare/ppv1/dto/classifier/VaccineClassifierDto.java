package today.smarthealthcare.ppv1.dto.classifier;

import com.google.common.base.MoreObjects;

/**
 * Vaccine classifier
 *
 * @author: Vadim Nesmashnov
 */
public class VaccineClassifierDto extends ClassifierDto implements IClassifierWithUnit {
    private String unit;

	public VaccineClassifierDto(String code, String name, String unit) {
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
