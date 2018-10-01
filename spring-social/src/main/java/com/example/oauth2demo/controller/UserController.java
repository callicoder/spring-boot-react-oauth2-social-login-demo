package com.example.oauth2demo.controller;

import com.example.oauth2demo.payload.UserProfile;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @GetMapping("/user/me")
    public UserProfile getCurrentUser() {
        return null;
    }
}
