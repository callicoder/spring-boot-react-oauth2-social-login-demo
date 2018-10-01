package com.example.springsocial.controller;

import com.example.springsocial.payload.UserProfile;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @GetMapping("/user/me")
    public UserProfile getCurrentUser() {
        return null;
    }
}
