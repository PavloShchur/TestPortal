package com.pavlo.testPortal.service;

import com.pavlo.testPortal.entity.User;
import org.springframework.stereotype.Service;

import java.util.List;

public interface UserService {

    void save(String name);
    void save(User user);
    User findOne(int id);
    List<User> findAll();
}
