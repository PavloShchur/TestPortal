package com.pavlo.testPortal.controller;

import com.pavlo.testPortal.entity.Answer;
import com.pavlo.testPortal.service.AnswerService;
import com.pavlo.testPortal.service.UserService;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexController {

    Logger logger = Logger.getLogger(MainController.class);

    @GetMapping("/")
    public String toMainPage() {
        logger.info("Logger is working!!!");
        return "index";
    }

}
