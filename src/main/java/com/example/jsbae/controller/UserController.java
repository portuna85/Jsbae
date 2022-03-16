package com.example.jsbae.controller;

import com.example.jsbae.domain.User;
import com.example.jsbae.repository.UserRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@Slf4j
@RestController
public class UserController {

    @Autowired
    UserRepository userRepository;

    @PostMapping("/signup")
    public void createUser(@ModelAttribute User user) {
        log.info("user: {}, result: {}", user.toString(), "success");
        userRepository.createUser(user);
    }

    @GetMapping("/users")
    public Map<Long, User> userFindAll() {
        return userRepository.userFindAll();
    }

    @GetMapping("/user/{userIdx}")
    public User userInfo(@PathVariable long userIdx) {
        return userRepository.userInfo(userIdx);
    }

    @PutMapping("/user/{userIdx}")
    public void updateUser(@PathVariable long userIdx,
                           @RequestBody User user) {
        log.info("messageBody={}", user);
        userRepository.updateUser(userIdx, user);
    }

    @DeleteMapping("/user/{userIdx}")
    public void deleteUser(@PathVariable long userIdx) {
        userRepository.deleteUserByIdx(userIdx);
    }

    @DeleteMapping("/user")
    public User deleteUser(@RequestBody User user) {
        return userRepository.deleteUserByBody(user);
    }
}