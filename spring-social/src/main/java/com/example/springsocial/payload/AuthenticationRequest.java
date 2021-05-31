package com.example.springsocial.payload;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

public final class AuthenticationRequest {

    /**
     * declares variable.
     */
    private final String userName;
    /**
     * declares variable.
     */
    private final String password;

    /**
     * initializing the userName,password.
     *
     * @param anUserName
     * @param aPassword
     */
    @JsonCreator
    public AuthenticationRequest(
            @JsonProperty("userName") final String anUserName,
            @JsonProperty("password") final String aPassword) {
        this.userName = anUserName;
        this.password = aPassword;
    }

    /**
     * gets the value for userName.
     *
     * @return username
     */
    public String getUserName() {
        return userName;
    }

    /**
     * gets the value for password.
     *
     * @return password
     */
    public String getPassword() {
        return password;
    }

}
