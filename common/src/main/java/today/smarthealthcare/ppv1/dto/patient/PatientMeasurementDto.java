package today.smarthealthcare.ppv1.dto.patient;

import today.smarthealthcare.ppv1.dto.classifier.MeasurementClassifierDto;
import com.google.common.base.MoreObjects;

import java.io.Serializable;
import java.util.Date;

/**
 * Patient measurement DTO
 *
 * @author: Vadim Nesmashnov
 */
public class PatientMeasurementDto implements Serializable {
    private Long id;
    private MeasurementClassifierDto classifier;
    private Date date;
    private String value;
    private boolean imported;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public MeasurementClassifierDto getClassifier() {
        return classifier;
    }

    public void setClassifier(MeasurementClassifierDto classifier) {
        this.classifier = classifier;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public boolean isImported() {
        return imported;
    }

    public void setImported(boolean imported) {
        this.imported = imported;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        PatientMeasurementDto that = (PatientMeasurementDto) o;

        if (!id.equals(that.id)) return false;

        return true;
    }

    @Override
    public int hashCode() {
        return id.hashCode();
    }

    @Override
    public String toString() {
        return MoreObjects.toStringHelper(this)
                .add("id", id)
                .add("classifier", classifier)
                .add("date", date)
                .add("value", value)
                .add("imported", imported)
                .toString();
    }
}
