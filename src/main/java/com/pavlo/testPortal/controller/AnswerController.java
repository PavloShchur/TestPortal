package com.pavlo.testPortal.controller;

import com.pavlo.testPortal.entity.Answer;
import com.pavlo.testPortal.service.AnswerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class AnswerController {

    @Autowired
    AnswerService answerService;

        @PostMapping("/answer")
        public String saveAnswer(@ModelAttribute(value = "emptyAnswer") Answer answer){

                answerService.save(answer);

            return "redirect:/getAllAnswers";
        }
}
