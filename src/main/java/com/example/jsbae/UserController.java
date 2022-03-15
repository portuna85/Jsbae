package com.example.jsbae;

import com.example.jsbae.repository.UserRepository;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    /*
    Data 전송 방식
        @RequestBody   - Body Json
        @RequestParam  - Body form, queryString
        @PathVariable  - 경로 Path
    */


    UserRepository userRepository;

    @PutMapping("/update/{id}")
    public void updateUser(@RequestBody User user,
                           @PathVariable long id) {

    }
}