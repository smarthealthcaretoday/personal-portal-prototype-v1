package today.smarthealthcare.ppv1.ihealth.config;

import com.google.common.base.MoreObjects;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
public class IHealthProperties {
    public static final Logger LOGGER = LoggerFactory.getLogger(IHealthProperties.class);

    @Autowired
    private Environment environment;

    private String iHealthHost;
    private String userAuthorizationUrl;
    private String accessTokenEndpoint;
    private String userDataEndpoint;

    private String clientId;
    private String clientSecret;
    private String redirectForCode;
    private String redirectForAccessToken;
    private String applicationName;

    private String authorizationResponseType;
    private String grantType;

    private String bloodPressureApiName;
    private String bloodPressureSc;
    private String bloodPressureSv;

    private String bloodOxygenApiName;
    private String bloodOxygenSc;
    private String bloodOxygenSv;

    private String weightApiName;
    private String weightSc;
    private String weightSv;

    @PostConstruct
    public void init() {
        iHealthHost = environment.getProperty("ihealth.host");
        userAuthorizationUrl = iHealthHost + environment.getProperty("ihealth.userAuthorizationUrl");
        accessTokenEndpoint = iHealthHost + environment.getProperty("ihealth.accessTokenEndpoint");
        userDataEndpoint = iHealthHost + environment.getProperty("ihealth.userDataEndpoint");

        clientId = environment.getProperty("ihealth.clientId");
        clientSecret = environment.getProperty("ihealth.clientSecret");
        redirectForCode = environment.getProperty("ihealth.redirectForCode");
        redirectForAccessToken = environment.getProperty("ihealth.redirectForAccessToken");
        applicationName = environment.getProperty("ihealth.applicationName");

        authorizationResponseType = environment.getProperty("ihealth.authorizationResponseType");
        grantType = environment.getProperty("ihealth.grantType");

        bloodPressureApiName = environment.getProperty("ihealth.bp.apiName");
        bloodPressureSc = environment.getProperty("ihealth.bp.sc");
        bloodPressureSv = environment.getProperty("ihealth.bp.sv");

        bloodOxygenApiName = environment.getProperty("ihealth.bo.apiName");
        bloodOxygenSc = environment.getProperty("ihealth.bo.sc");
        bloodOxygenSv = environment.getProperty("ihealth.bo.sv");

        weightApiName = environment.getProperty("ihealth.weight.apiName");
        weightSc = environment.getProperty("ihealth.weight.sc");
        weightSv = environment.getProperty("ihealth.weight.sv");

        LOGGER.info(MoreObjects.toStringHelper("IHealth configuration ")
                .add("host", iHealthHost)
                .add("userAuthorizationUrl", userAuthorizationUrl)
                .add("accessTokenEndpoint", accessTokenEndpoint)
                .add("userDataEndpoint", userDataEndpoint)
                .toString());
    }

    public String getiHealthHost() {
        return iHealthHost;
    }

    public void setiHealthHost(String iHealthHost) {
        this.iHealthHost = iHealthHost;
    }

    public String getUserAuthorizationUrl() {
        return userAuthorizationUrl;
    }

    public void setUserAuthorizationUrl(String userAuthorizationUrl) {
        this.userAuthorizationUrl = userAuthorizationUrl;
    }

    public String getAccessTokenEndpoint() {
        return accessTokenEndpoint;
    }

    public void setAccessTokenEndpoint(String accessTokenEndpoint) {
        this.accessTokenEndpoint = accessTokenEndpoint;
    }

    public String getUserDataEndpoint() {
        return userDataEndpoint;
    }

    public void setUserDataEndpoint(String userDataEndpoint) {
        this.userDataEndpoint = userDataEndpoint;
    }

    public String getClientId() {
        return clientId;
    }

    public void setClientId(String clientId) {
        this.clientId = clientId;
    }

    public String getClientSecret() {
        return clientSecret;
    }

    public void setClientSecret(String clientSecret) {
        this.clientSecret = clientSecret;
    }

    public String getRedirectForCode() {
        return redirectForCode;
    }

    public void setRedirectForCode(String redirectForCode) {
        this.redirectForCode = redirectForCode;
    }

    public String getRedirectForAccessToken() {
        return redirectForAccessToken;
    }

    public void setRedirectForAccessToken(String redirectForAccessToken) {
        this.redirectForAccessToken = redirectForAccessToken;
    }

    public String getApplicationName() {
        return applicationName;
    }

    public void setApplicationName(String applicationName) {
        this.applicationName = applicationName;
    }

    public String getBloodPressureApiName() {
        return bloodPressureApiName;
    }

    public void setBloodPressureApiName(String bloodPressureApiName) {
        this.bloodPressureApiName = bloodPressureApiName;
    }

    public String getBloodPressureSc() {
        return bloodPressureSc;
    }

    public void setBloodPressureSc(String bloodPressureSc) {
        this.bloodPressureSc = bloodPressureSc;
    }

    public String getBloodPressureSv() {
        return bloodPressureSv;
    }

    public void setBloodPressureSv(String bloodPressureSv) {
        this.bloodPressureSv = bloodPressureSv;
    }

    public String getAuthorizationResponseType() {
        return authorizationResponseType;
    }

    public void setAuthorizationResponseType(String authorizationResponseType) {
        this.authorizationResponseType = authorizationResponseType;
    }

    public String getGrantType() {
        return grantType;
    }

    public void setGrantType(String grantType) {
        this.grantType = grantType;
    }

    public String getBloodOxygenApiName() {
        return bloodOxygenApiName;
    }

    public void setBloodOxygenApiName(String bloodOxygenApiName) {
        this.bloodOxygenApiName = bloodOxygenApiName;
    }

    public String getBloodOxygenSc() {
        return bloodOxygenSc;
    }

    public void setBloodOxygenSc(String bloodOxygenSc) {
        this.bloodOxygenSc = bloodOxygenSc;
    }

    public String getBloodOxygenSv() {
        return bloodOxygenSv;
    }

    public void setBloodOxygenSv(String bloodOxygenSv) {
        this.bloodOxygenSv = bloodOxygenSv;
    }

    public String getWeightApiName() {
        return weightApiName;
    }

    public void setWeightApiName(String weightApiName) {
        this.weightApiName = weightApiName;
    }

    public String getWeightSc() {
        return weightSc;
    }

    public void setWeightSc(String weightSc) {
        this.weightSc = weightSc;
    }

    public String getWeightSv() {
        return weightSv;
    }

    public void setWeightSv(String weightSv) {
        this.weightSv = weightSv;
    }
}
