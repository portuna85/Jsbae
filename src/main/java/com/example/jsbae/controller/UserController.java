package com.example.jsbae.controller;

import com.example.jsbae.User;
import com.example.jsbae.repository.UserRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
public class UserController {

    private Logger log = LoggerFactory.getLogger(getClass());
    @Autowired
    UserRepository userRepository;

    @PostMapping("/signup")
    public void createUser(@RequestBody User user) {
        log.info("user={}" + user);
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