package today.smarthealthcare.ppv1.dto.healthStatement;

/**
 * Working environment part of personal health statement DTO
 *
 * @author: Vadim Nesmashnov
 */
public class WorkingEnvironmentDto {
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
}
