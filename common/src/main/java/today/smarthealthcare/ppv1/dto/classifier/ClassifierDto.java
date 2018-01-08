package today.smarthealthcare.ppv1.dto.classifier;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.google.common.base.MoreObjects;

import java.io.Serializable;

/**
 * Base classifier
 *
 * @author: Vadim Nesmashnov
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class ClassifierDto implements Serializable {
    private String code;
    private String name;
    private ClassifierDto originalObject;

    public ClassifierDto() {
    }

    public ClassifierDto(String code, String name) {
        this.code = code;
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ClassifierDto getOriginalObject() {
        return originalObject;
    }

    public void setOriginalObject(ClassifierDto originalObject) {
        this.originalObject = originalObject;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ClassifierDto that = (ClassifierDto) o;

        if (!code.equals(that.code)) return false;

        return true;
    }

    @Override
    public int hashCode() {
        return code.hashCode();
    }

    @Override
    public String toString() {
        return MoreObjects.toStringHelper(this)
                .add("code", code)
                .add("name", name)
                .toString();
    }
}
