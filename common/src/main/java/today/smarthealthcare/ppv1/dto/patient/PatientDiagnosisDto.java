package today.smarthealthcare.ppv1.dto.patient;

import today.smarthealthcare.ppv1.dto.classifier.DiagnosisClassifierDto;
import com.google.common.base.MoreObjects;

import java.io.Serializable;
import java.util.Date;

/**
 * Patient diagnosis DTO
 *
 * @author: Vadim Nesmashnov
 */
public class PatientDiagnosisDto implements Serializable {
    private Long id;
    private DiagnosisClassifierDto classifier;
    private Date startDate;
    private Date endDate;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public DiagnosisClassifierDto getClassifier() {
        return classifier;
    }

    public void setClassifier(DiagnosisClassifierDto classifier) {
        this.classifier = classifier;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        PatientDiagnosisDto that = (PatientDiagnosisDto) o;

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
                .add("startDate", startDate)
                .add("endDate", endDate)
                .toString();
    }
}
