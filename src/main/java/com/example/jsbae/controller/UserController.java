package com.example.jsbae.controller;


import com.example.jsbae.User;
import com.example.jsbae.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @Autowired
    UserRepository userRepository;

    @PostMapping("/signup")
    public void createUser(@RequestBody User user) {
        userRepository.createUser(user);
    }
}
