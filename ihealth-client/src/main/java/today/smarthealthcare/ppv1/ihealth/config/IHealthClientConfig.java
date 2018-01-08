package today.smarthealthcare.ppv1.ihealth.config;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.*;
import org.springframework.http.converter.StringHttpMessageConverter;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableOAuth2Client;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

/**
 * Configuration for iCloud client.
 *
 * @author: Vadim Nesmashnov
 */
@Configuration
@PropertySources({
        @PropertySource(value = "classpath:conf/ihealth-default.properties"),
        @PropertySource(value = "classpath:conf/ihealth.properties", ignoreResourceNotFound = true)
})
@EnableOAuth2Client
@ComponentScan({"today.smarthealthcare.ppv1.ihealth"})
public class IHealthClientConfig {

    @Bean
    public RestTemplate iHealthRestTemplate() {
        RestTemplate restTemplate = new RestTemplate();
        restTemplate.getMessageConverters().add(new StringHttpMessageConverter());

        return restTemplate;
    }
}
