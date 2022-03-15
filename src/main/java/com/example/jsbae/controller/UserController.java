package com.example.jsbae.controller;


import com.example.jsbae.User;
import com.example.jsbae.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class UserController {

    @Autowired
    UserRepository userRepository;

    @PostMapping("/signup")
    public void createUser(@RequestBody User user) {
        userRepository.createUser(user);
    }

    @GetMapping("/user/{userIdx}")
    public void userInfo(@PathVariable long userIdx) {
        userRepository.userInfo(userIdx);
    }

    @PutMapping("/user/{userIdx}")
    public void updateUser(@PathVariable long userIdx,
                           @RequestBody User user) {
        userRepository.updateUser(userIdx, user);
    }

}
