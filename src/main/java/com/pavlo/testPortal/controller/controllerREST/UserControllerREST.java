package com.pavlo.testPortal.controller.controllerREST;

import com.pavlo.testPortal.entity.User;
import com.pavlo.testPortal.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserControllerREST {

    @Autowired
    private UserService userService;

    @PostMapping("/saveUser")
    public void saveUser(@RequestBody User user) {
        userService.save(user);

    }

    @GetMapping("/show")
    public List<User> show(){
        return userService.findAll();
    }
}