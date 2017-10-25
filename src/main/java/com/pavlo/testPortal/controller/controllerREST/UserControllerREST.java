package com.pavlo.testPortal.controller.controllerREST;

import com.pavlo.testPortal.entity.User;
import com.pavlo.testPortal.service.UserService;
import com.pavlo.testPortal.validators.UserValidator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
public class UserControllerREST {

    @Autowired
    private UserService userService;

    @Autowired
    private UserValidator userValidator;

    @PostMapping("/saveUser")
    public String saveUser(@RequestBody @Valid User user, BindingResult bindingResult) {

        if (bindingResult.hasErrors()) {

        } else {

            userService.save(user);

        }

        return null;
    }

    @GetMapping("/show")
    public List<User> show() {

        return userService.findAll();

    }

    @InitBinder
    public void bind(WebDataBinder webDataBinder) {

        webDataBinder.addValidators(userValidator);

    }
}