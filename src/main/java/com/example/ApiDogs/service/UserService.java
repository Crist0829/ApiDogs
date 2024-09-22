package com.example.ApiDogs.service;


import org.springframework.stereotype.Service;
import com.example.ApiDogs.model.User;
import com.example.ApiDogs.repository.UserRepository;
import java.util.ArrayList;
import java.util.List;

@Service
public class UserService {
    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public List<User> allUsers() {
        List<User> users = new ArrayList<>();

        userRepository.findAll().forEach(users::add);

        return users;
    }
}