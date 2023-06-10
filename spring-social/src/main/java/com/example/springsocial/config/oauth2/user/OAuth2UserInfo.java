package com.example.springsocial.config.oauth2.user;

import java.util.Map;

public abstract sealed class OAuth2UserInfo permits GoogleOAuth2UserInfo, GithubOAuth2UserInfo, FacebookOAuth2UserInfo {
    protected Map<String, Object> attributes;

    protected OAuth2UserInfo(Map<String, Object> attributes) {
        this.attributes = attributes;
    }

    public Map<String, Object> getAttributes() {
        return attributes;
    }

    public abstract String getId();

    public abstract String getName();

    public abstract String getEmail();

    public abstract String getImageUrl();
}
