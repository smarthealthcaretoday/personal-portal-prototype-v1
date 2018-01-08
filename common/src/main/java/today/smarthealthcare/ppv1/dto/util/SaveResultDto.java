package today.smarthealthcare.ppv1.dto.util;

import today.smarthealthcare.ppv1.dto.util.ResultDto;
import com.google.common.base.MoreObjects;

/**
 * @author: Vadim Nesmashnov
 */
public class SaveResultDto extends ResultDto {
    private Long id;

    public SaveResultDto() {
    }

    public SaveResultDto(String result) {
        super(result);
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return MoreObjects.toStringHelper(this)
                .add("id", id)
                .toString();
    }
}
