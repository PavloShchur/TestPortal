package com.pavlo.testPortal.controller;

import com.pavlo.testPortal.entity.Answer;
import com.pavlo.testPortal.service.AnswerService;
import com.pavlo.testPortal.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexController {

    @Autowired
    UserService userService;

    @Autowired
    AnswerService answerService;

    @GetMapping("/getAllUsers")
    public String getAllUsers(Model model) {
        model.addAttribute("allUsers", userService.findAll());
        return "userViews/allUsers";
    }

    @GetMapping("/getAllAnswers")
    public String getAllAnswers(Model model) {
        model.addAttribute("allAnswers", answerService.findAll());
        model.addAttribute("emptyAnswer", new Answer());
        return "answerViews/allAnswers";
    }
}
