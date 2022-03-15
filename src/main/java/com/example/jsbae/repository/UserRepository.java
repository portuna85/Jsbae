package com.example.jsbae.repository;

import com.example.jsbae.User;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

@Component
public class UserRepository {

    private Map<Long, User> userMap = new HashMap<>();
    private Long userIdx = 0L;

    public void createUser(User user) {
        userMap.put(++userIdx, user);
    }

    public void userInfo(long userIdx) {
        userMap.get(userIdx);
    }

    public void updateUser(long userIdx, User user) {
        userMap.put(userIdx, user);
    }
}