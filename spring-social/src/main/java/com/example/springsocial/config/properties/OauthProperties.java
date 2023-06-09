package com.example.springsocial.config.properties;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = "oauth")
public class OauthProperties {

    private String[] authorizedRedirectUris;

    public String[] getAuthorizedRedirectUris() {
        return authorizedRedirectUris;
    }

    public void setAuthorizedRedirectUris(String[] authorizedRedirectUris) {
        this.authorizedRedirectUris = authorizedRedirectUris;
    }


}
