package com.pavlo.testPortal.service;

import com.pavlo.testPortal.entity.QuestionWithSingleAnswer;

import java.util.List;

public interface QuestionWithSingleAnswerService {

    void save(String descriptionOfQuestion);
    void save(QuestionWithSingleAnswer questionWithSingleAnswer);
    QuestionWithSingleAnswer findOne(int id);
    List<QuestionWithSingleAnswer> findAll();
}
