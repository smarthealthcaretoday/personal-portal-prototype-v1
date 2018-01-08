package today.smarthealthcare.ppv1.dto.reminder;

import com.google.common.base.MoreObjects;

/**
 * Reminder DTO
 *
 * @author: Vadim Nesmashnov
 */
public class ReminderDto {
    private String shortDescription;
    private String longDescription;
    private String froNurse;
    private String forPatient;
    private int level;

    public String getShortDescription() {
        return shortDescription;
    }

    public void setShortDescription(String shortDescription) {
        this.shortDescription = shortDescription;
    }

    public String getLongDescription() {
        return longDescription;
    }

    public void setLongDescription(String longDescription) {
        this.longDescription = longDescription;
    }

    public String getFroNurse() {
        return froNurse;
    }

    public void setFroNurse(String froNurse) {
        this.froNurse = froNurse;
    }

    public String getForPatient() {
        return forPatient;
    }

    public void setForPatient(String forPatient) {
        this.forPatient = forPatient;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    @Override
    public String toString() {
        return MoreObjects.toStringHelper(this)
                .add("shortDescription", shortDescription)
                .add("longDescription", longDescription)
                .add("froNurse", froNurse)
                .add("forPatient", forPatient)
                .add("level", level)
                .toString();
    }
}
