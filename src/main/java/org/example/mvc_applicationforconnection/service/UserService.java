package org.example.mvc_applicationforconnection.service;

import lombok.RequiredArgsConstructor;

import org.example.mvc_applicationforconnection.model.User;
import org.example.mvc_applicationforconnection.repository.UserRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class UserService {

    private final UserRepository repository;

    public User save(User user) {
        return repository.save(user);
    }


    public List<User> getAllUsers() {
        return repository.findAll();
    }
}
