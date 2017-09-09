package com.pavlo.testPortal.service.implementation;

import com.pavlo.testPortal.dao.UserDAO;
import com.pavlo.testPortal.entity.User;
import com.pavlo.testPortal.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class UserServiceImplementation implements UserService {
    @Autowired
    private UserDAO userDAO;

    @Override
    public void save(String name, String email) {
        if (!name.isEmpty() && name != null) {
            User user = User.builder().name(name).email(email).build();
            userDAO.save(user);
        }
    }

    @Override
    public void save(User user) {
        userDAO.save(user);
    }

    @Override
    public User findOne(int id) {
        return userDAO.findOne(id);
    }

    @Override
    public List<User> findAll() {
        return userDAO.findAll();
    }
}
