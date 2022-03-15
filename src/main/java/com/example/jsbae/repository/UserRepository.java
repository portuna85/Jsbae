package com.example.jsbae.repository;

import com.example.jsbae.User;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

@Component
public class UserRepository {

    private Map<Long, User> userMap = new HashMap<>();
    private Long userIdx;

    public void createUser(User user) {
        userMap.put(++userIdx, user);
    }
}
