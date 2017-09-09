package com.pavlo.testPortal.controller;


import com.pavlo.testPortal.service.UserService;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainController {

    Logger logger = Logger.getLogger(MainController.class);

    @Autowired
    UserService userService;

    @GetMapping("/")
    public String toMainPage() {
        logger.info("Logger is working!!!");
        return "index";
    }
}
