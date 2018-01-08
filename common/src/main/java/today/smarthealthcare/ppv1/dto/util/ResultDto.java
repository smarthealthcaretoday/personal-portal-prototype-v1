package today.smarthealthcare.ppv1.dto.util;

import com.google.common.base.MoreObjects;

import java.io.Serializable;

/**
 * Folds the result of server operation
 */
public class ResultDto implements Serializable {

    private String result;

    public ResultDto() {
    }

    public ResultDto(String result) {
        this.result = result;
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }

    @Override
    public String toString() {
        return MoreObjects.toStringHelper(this)
                .add("result", result)
                .toString();
    }
}
