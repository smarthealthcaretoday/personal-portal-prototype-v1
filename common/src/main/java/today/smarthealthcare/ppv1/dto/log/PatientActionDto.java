package today.smarthealthcare.ppv1.dto.log;

import com.google.common.base.MoreObjects;

import java.io.Serializable;
import java.util.Date;

/**
 * Patient action (log record)
 *
 * @author: Vadim Nesmashnov
 */
public class PatientActionDto implements Serializable {
    private Long id;

    private Date date;

    private String patientName;

    private ActionType actionType;

    private String details;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getPatientName() {
        return patientName;
    }

    public void setPatientName(String patientName) {
        this.patientName = patientName;
    }

    public ActionType getActionType() {
        return actionType;
    }

    public void setActionType(ActionType actionType) {
        this.actionType = actionType;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }

    @Override
    public String toString() {
        return MoreObjects.toStringHelper(this)
                .add("id", id)
                .add("date", date)
                .add("patientName", patientName)
                .add("actionType", actionType)
                .add("details", details)
                .toString();
    }
}
