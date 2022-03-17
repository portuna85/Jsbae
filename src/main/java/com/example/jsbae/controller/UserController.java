package com.example.jsbae.controller;

import com.example.jsbae.domain.User;
import com.example.jsbae.repository.UserRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@Slf4j
@RestController
public class UserController {

    UserRepository userRepository;

    @PostMapping("/signup")
    public String createUser(@ModelAttribute User user, Model model) {
        log.info("user: {}, result: {}", user.toString(), "success");
        userRepository.createUser(user);
        return "basic/signup";
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

    @DeleteMapping("/users/delete")
    public void userTerminate() {
        userRepository.userTerminate();
    }

    @DeleteMapping("/user")
    public User deleteUser(@RequestBody User user) {
        return userRepository.deleteUserByBody(user);
    }
}