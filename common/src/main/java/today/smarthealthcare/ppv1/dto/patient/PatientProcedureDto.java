package today.smarthealthcare.ppv1.dto.patient;

import today.smarthealthcare.ppv1.dto.classifier.ProcedureClassifierDto;
import com.google.common.base.MoreObjects;

import java.io.Serializable;
import java.util.Date;

/**
 * Patient procedure DTO
 *
 * @author: Vadim Nesmashnov
 */
public class PatientProcedureDto implements Serializable {
    private Long id;
    private ProcedureClassifierDto classifier;
    private Date date;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public ProcedureClassifierDto getClassifier() {
        return classifier;
    }

    public void setClassifier(ProcedureClassifierDto classifier) {
        this.classifier = classifier;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        PatientProcedureDto that = (PatientProcedureDto) o;

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
                .toString();
    }
}
