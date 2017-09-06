package com.pavlo.testPortal.service.implementation;

import com.pavlo.testPortal.DAO.QuestionWithSingleAnswerDAO;
import com.pavlo.testPortal.entity.QuestionWithSingleAnswer;
import com.pavlo.testPortal.service.QuestionWithSingleAnswerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class QuestionWithSingleAnswerServiceImplementation implements QuestionWithSingleAnswerService {

    @Autowired
    private QuestionWithSingleAnswerDAO questionWithSingleAnswerDAO;

    @Override
    public void save(String descriptionOfQuestion) {

        QuestionWithSingleAnswer questionWithSingleAnswer
                = new QuestionWithSingleAnswer(questionWithSingleAnswerDAO);
        questionWithSingleAnswerDAO.save(questionWithSingleAnswer);
    }

    @Override
    public void save(QuestionWithSingleAnswer questionWithSingleAnswer) {
            questionWithSingleAnswerDAO.save(questionWithSingleAnswer);
    }

    @Override
    public QuestionWithSingleAnswer findOne(int id) {
        return questionWithSingleAnswerDAO.findOne(id);
    }

    @Override
    public List<QuestionWithSingleAnswer> findAll() {
        return questionWithSingleAnswerDAO.findAll();
    }
}
