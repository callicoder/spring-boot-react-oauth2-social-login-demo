package com.techatpark.starter.security.controller;

import com.techatpark.starter.security.exception.ResourceNotFoundException;
import com.techatpark.starter.security.model.User;
import com.techatpark.starter.security.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;

@RestController
public class UserController {

    @Autowired
    private UserRepository userRepository;

    @GetMapping("/api/auth/me")
    @PreAuthorize("hasRole('USER')")
    public User getCurrentUser(Principal principal) {
        return userRepository.findByName(principal.getName())
                .orElseThrow(() -> new ResourceNotFoundException("User", "id",
                        principal.getName()));
    }
}
