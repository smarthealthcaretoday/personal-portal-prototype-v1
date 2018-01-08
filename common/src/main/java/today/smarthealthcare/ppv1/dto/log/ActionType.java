package today.smarthealthcare.ppv1.dto.log;

/**
 * Action type
 *
 * @author: Vadim Nesmashnov
 */
public enum ActionType {
    EBMEDS_REQUEST("Request to EBMeDS"),
    EBMEDS_RESPONSE("Response from EBMeDS");

    private String label;

    private ActionType(String label) {
        this.label = label;
    }

    public String getLabel() {
        return label;
    }
}
