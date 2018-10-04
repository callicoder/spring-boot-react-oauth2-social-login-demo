package com.example.springsocial.payload;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;

/**
 * Created by rajeevkumarsingh on 02/08/17.
 */
public class LoginRequest {
    @NotBlank
    @Email
    private String email;

    @NotBlank
    private String password;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
