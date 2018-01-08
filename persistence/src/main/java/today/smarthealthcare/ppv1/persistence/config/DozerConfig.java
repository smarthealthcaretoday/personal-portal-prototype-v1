package today.smarthealthcare.ppv1.persistence.config;

import today.smarthealthcare.ppv1.persistence.mapper.ClassifierDoezerEventListener;
import org.dozer.DozerBeanMapper;
import org.dozer.DozerEventListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
import java.util.List;

import today.smarthealthcare.ppv1.persistence.mapper.ClassifierDoezerEventListener;

/**
 * Dozer configuration
 *
 * @author: Vadim Nesmashnov
 */
@Configuration
@ComponentScan("today.smarthealthcare.ppv1.persistence.mapper")
public class DozerConfig {
    @Autowired
    private ClassifierDoezerEventListener classifierDoezerEventListener;

    @Bean
    public DozerBeanMapper dozerBeanMapper() {
        DozerBeanMapper dozerBeanMapper = new DozerBeanMapper();

        List<String> myMappingFiles = new ArrayList<>();
        myMappingFiles.add("dozer/dozer-bean-mapping.xml");

        dozerBeanMapper.setMappingFiles(myMappingFiles);

        List<DozerEventListener> eventListeners = new ArrayList<>();
        eventListeners.add(classifierDoezerEventListener);

        dozerBeanMapper.setEventListeners(eventListeners);

        return dozerBeanMapper;
    }
}
