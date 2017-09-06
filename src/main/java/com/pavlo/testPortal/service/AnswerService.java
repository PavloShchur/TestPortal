package com.pavlo.testPortal.service;

import com.pavlo.testPortal.entity.Answer;

import java.util.List;

public interface AnswerService {

    void save(String descriptionOfAnswer);
    void save(Answer answer);
    Answer findOne(int id);
    List<Answer> findAll();
}
