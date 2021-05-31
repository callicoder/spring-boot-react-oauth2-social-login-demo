package com.example.springsocial.repository;

import com.example.springsocial.model.User;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Component
public class UserRepository {

    private final List<User> users;

    public UserRepository() {
        this.users = new ArrayList<>();
    }

    public Optional<User> findByName(String name) {
        return this.users.stream()
                .filter(user -> user.getName().equals(name))
                .findFirst();
    }

    public Boolean existsByName(String name) {
        return this.users.stream()
                .anyMatch(user -> user.getName().equals(name));
    }

    public User save(User user) {
        users.add(user);
        return user;
    }
}
