package today.smarthealthcare.ppv1.persistence.model.healthStatement;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Objects;

/**
 * Working environment part of personal health statement
 *
 * @author: Vadim Nesmashnov
 */
@Entity
@Table(name = "HEALTHSTATEMENTWORKINGENVIRONMENT")
public class WorkingEnvironment {
    @Id
    @GeneratedValue
    private Long id;
    private boolean restrictions;
    private String restrictionsDetails;
    private boolean healthProblems;
    private String healthProblemsDetails;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public boolean isRestrictions() {
        return restrictions;
    }

    public void setRestrictions(boolean restrictions) {
        this.restrictions = restrictions;
    }

    public String getRestrictionsDetails() {
        return restrictionsDetails;
    }

    public void setRestrictionsDetails(String restrictionsDetails) {
        this.restrictionsDetails = restrictionsDetails;
    }

    public boolean isHealthProblems() {
        return healthProblems;
    }

    public void setHealthProblems(boolean healthProblems) {
        this.healthProblems = healthProblems;
    }

    public String getHealthProblemsDetails() {
        return healthProblemsDetails;
    }

    public void setHealthProblemsDetails(String healthProblemsDetails) {
        this.healthProblemsDetails = healthProblemsDetails;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        WorkingEnvironment that = (WorkingEnvironment) o;
        return Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
