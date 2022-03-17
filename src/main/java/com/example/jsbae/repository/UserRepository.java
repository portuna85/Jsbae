package com.example.jsbae.repository;


import com.example.jsbae.domain.User;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.Map;

@Repository
public class UserRepository {

    private static final Map<Long, User> store = new HashMap<>();
    private static long userIdx = 0L;

    public User createUser(User user) {
        user.setUserIdx(++userIdx);
        store.put(user.getUserIdx(), user);
        return user;
    }

    public User userInfo(long userIdx) {
        return store.get(userIdx);
    }

    public void updateUser(long userIdx, User user) {
        store.put(userIdx, user);
    }

    public Map<Long, User> userFindAll() {
        return store;
    }

    public void deleteUserByIdx(long userIdx) {
        store.remove(userIdx);
    }

    public User deleteUserByBody(User user) {
        return store.remove(user);
    }

    public void userTerminate() {
        store.clear();
    }
}