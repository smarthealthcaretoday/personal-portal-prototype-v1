package today.smarthealthcare.ppv1.persistence.mapper;

import today.smarthealthcare.ppv1.dto.selfHealthCheck.SelfHealthCheckDto;
import today.smarthealthcare.ppv1.persistence.model.selfHealthCheck.SelfHealthCheck;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

import today.smarthealthcare.ppv1.dto.selfHealthCheck.SelfHealthCheckDto;

/**
 * @author: Vadim Nesmashnov
 */
@Component
public class SelfHealthCheckDtoMapper extends DtoMapper<SelfHealthCheckDto, SelfHealthCheck> {
    @PostConstruct
    public void init() {
        setDtoType(SelfHealthCheckDto.class);
        setEntityType(SelfHealthCheck.class);
    }
}
