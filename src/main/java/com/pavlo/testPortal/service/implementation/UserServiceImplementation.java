package com.pavlo.testPortal.service.implementation;

import com.pavlo.testPortal.DAO.UserDAO;
import com.pavlo.testPortal.service.UserService;
import lombok.Setter;

@Setter
public class UserServiceImplementation implements UserService {

    private UserDAO userDAO;

    @Override
    public void save(String name) {

    }
}
