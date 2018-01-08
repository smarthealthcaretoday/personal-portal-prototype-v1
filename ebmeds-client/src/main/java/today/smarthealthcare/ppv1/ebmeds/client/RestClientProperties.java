package today.smarthealthcare.ppv1.ebmeds.client;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * Properties holder for REST client
 *
 * @author: Vadim Nesmashnov
 */
@Component
public class RestClientProperties {
    @Value("#{ ebmeds['ebmeds.apiPath'] }")
    private String apiPath;
    @Value("#{ ebmeds['ebmeds.url'] }")
    private String url;

    /**
     * Gets base URI for the EBmeDS REST APIs.
     */
    public String getApiPath() {
        return apiPath;
    }

    /**
     * Gets URL.
     */
    public String getUrl() {
        return url;
    }

}

