package today.smarthealthcare.ppv1.ihealth.dto;



import today.smarthealthcare.ppv1.ihealth.dto.data.IHealthBoDataDto;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.common.base.MoreObjects;

import java.util.List;

import today.smarthealthcare.ppv1.ihealth.dto.data.IHealthBoDataDto;

public class IHealthUserBoDataResponseDto extends IHealthUserDataResponseDto {
    @JsonProperty(value = "BODataList")
    private List<IHealthBoDataDto> boData;

    public List<IHealthBoDataDto> getBoData() {
        return boData;
    }

    public void setBoData(List<IHealthBoDataDto> boData) {
        this.boData = boData;
    }

    @Override
    public String toString() {
        return MoreObjects.toStringHelper(this)
                .add("", super.toString())
                .add("boData", boData)
                .toString();
    }
}
