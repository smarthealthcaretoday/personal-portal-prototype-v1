package today.smarthealthcare.ppv1.util;

import java.beans.PropertyEditorSupport;
import java.util.Date;

/**
 * Binder for date object assuming that date is represented by number of milliseconds
 */
public class DateFromMillisecondsEditor extends PropertyEditorSupport {
    @Override
    public void setAsText(String text) throws IllegalArgumentException {

        setValue(new Date(Long.parseLong(text)));
    }
}
