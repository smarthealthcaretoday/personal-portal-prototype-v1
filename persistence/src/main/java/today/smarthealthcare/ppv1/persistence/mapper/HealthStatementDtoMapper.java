package today.smarthealthcare.ppv1.persistence.mapper;

import today.smarthealthcare.ppv1.dto.healthStatement.HealthStatementDto;
import today.smarthealthcare.ppv1.persistence.model.healthStatement.HealthStatement;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

import today.smarthealthcare.ppv1.persistence.model.healthStatement.HealthStatement;

/**
 * Health statement DTO mapper
 *
 * @author: Vadim Nesmashnov
 */
@Component
public class HealthStatementDtoMapper extends DtoMapper<HealthStatementDto, HealthStatement> {
    @PostConstruct
    public void init() {
        setDtoType(HealthStatementDto.class);
        setEntityType(HealthStatement.class);
    }
}
