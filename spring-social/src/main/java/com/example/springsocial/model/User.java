package com.example.springsocial.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.validation.constraints.NotNull;


public class User {

    private String name;

    private String imageUrl;

    @JsonIgnore
    private String password;

    @NotNull
    private AuthProvider provider;

    private String providerId;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }


    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public AuthProvider getProvider() {
        return provider;
    }

    public void setProvider(AuthProvider provider) {
        this.provider = provider;
    }

    public String getProviderId() {
        return providerId;
    }

    public void setProviderId(String providerId) {
        this.providerId = providerId;
    }
}
