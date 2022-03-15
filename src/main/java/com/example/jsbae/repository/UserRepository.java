package com.example.jsbae.repository;

import com.example.jsbae.User;

import java.util.HashMap;
import java.util.Map;

public class UserRepository {
    private Map<Long, User> userMap = new HashMap<>();
    private Long idx;


    public UserRepository() {
    }

    public void createUser(User user) {
        userMap.put(++idx, user);
    }

    /*
    public void updateUser(long userId, User user) {
        userMap.put(userId, user);
    }
    */
}