package com.pavlo.testPortal.controller.controllerREST;

import com.pavlo.testPortal.entity.Answer;
import com.pavlo.testPortal.service.AnswerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AnswerControllerREST {

    @Autowired
    AnswerService answerService;

    @PostMapping("/saveAnswer")
    public void saveAnswer(@RequestBody Answer answer) {
        answerService.save(answer);
    }
}
