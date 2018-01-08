package today.smarthealthcare.ppv1.persistence.mapper;

import org.dozer.DozerBeanMapper;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Mapper between Entity and DTO objects
 *
 * @author: Vadim Nesmashnov
 */
public abstract class DtoMapper<T, K> {

    @Autowired
    private DozerBeanMapper dozerBeanMapper;

    private Class<T> dtoType;
    private Class<K> entityType;

    public void setDtoType(Class<T> dtoType) {
        this.dtoType = dtoType;
    }

    public void setEntityType(Class<K> entityType) {
        this.entityType = entityType;
    }

    public T getDto(K entity) {

        return dozerBeanMapper.map(entity, dtoType);
    }

    public K getEntity(T dto) {

        return dozerBeanMapper.map(dto, entityType);
    }

}
