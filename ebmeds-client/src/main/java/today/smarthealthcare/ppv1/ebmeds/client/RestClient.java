package today.smarthealthcare.ppv1.ebmeds.client;

import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import javax.annotation.PostConstruct;


/**
 * General REST client
 *
 * @author: Vadim Nesmashnov
 */
@Component
public class RestClient {
    private final static Logger LOGGER = LoggerFactory.getLogger(RestClient.class);

    private final RestTemplate template;
    private final RestClientProperties clientProperties;

    @Autowired
    public RestClient(@Qualifier("ebmedsRestTemplate")RestTemplate template, RestClientProperties clientProperties) {
        this.template = template;
        this.clientProperties = clientProperties;
    }

    @PostConstruct
    public void init() {
    }

    public RestTemplate getRestTemplate() {
        return template;
    }

    /**
     * Creates URL based on the URI passed in.
     */
    public String createUrl(String uri) {
        StringBuilder sb = new StringBuilder();
        sb.append(clientProperties.getUrl());
        sb.append(clientProperties.getApiPath());
        if (StringUtils.isNotEmpty(uri)) {
            sb.append(uri);
        }

        LOGGER.debug("URL is '{}'.", sb.toString());

        return sb.toString();
    }

}
