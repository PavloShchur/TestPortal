package com.pavlo.testPortal.controller;


import com.pavlo.testPortal.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainController {

    @Autowired
    UserService userService;

    @RequestMapping("/")
    public String toMainPage() {
        userService.findAll();
        return "index";
    }
}
