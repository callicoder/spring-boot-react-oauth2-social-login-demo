package com.techatpark.starter.security.repository;

import com.techatpark.starter.security.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Component
public class UserRepository {


    private final List<User> users;

    public UserRepository(final PasswordEncoder passwordEncoder) {
        this.users = new ArrayList<>();

        User user = new User();
        user.setName("tom");
        user.setPassword(passwordEncoder.encode("password"));

        users.add(user);

        user = new User();
        user.setName("jerry");
        user.setPassword(passwordEncoder.encode("password"));

        users.add(user);

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
