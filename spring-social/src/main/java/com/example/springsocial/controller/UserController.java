package com.example.springsocial.controller;

import com.example.springsocial.payload.UserProfile;
import com.example.springsocial.security.CurrentUser;
import com.example.springsocial.security.UserPrincipal;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @GetMapping("/user/me")
    public UserProfile getCurrentUser(@CurrentUser UserPrincipal userPrincipal) {
        UserProfile userProfile = new UserProfile();

        userProfile.setName(userPrincipal.getName());
        userProfile.setEmail(userPrincipal.getEmail());
        userProfile.setImageUrl(userPrincipal.getImageUrl());

        return userProfile;
    }
}
