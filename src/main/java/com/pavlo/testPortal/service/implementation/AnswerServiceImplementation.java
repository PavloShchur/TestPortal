package com.pavlo.testPortal.service.implementation;

import com.pavlo.testPortal.dao.AnswerDAO;
import com.pavlo.testPortal.entity.Answer;
import com.pavlo.testPortal.service.AnswerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class AnswerServiceImplementation implements AnswerService {

    @Autowired
    AnswerDAO answerDAO;

    @Override
    public void save(String descriptionOfAnswer) {
        Answer answer = new Answer(descriptionOfAnswer);
        answerDAO.save(answer);
    }

    @Override
    public void save(Answer answer) {
        answerDAO.save(answer);
    }

    @Override
    public Answer findOne(int id) {
        return answerDAO.findOne(id);
    }

    @Override
    public List<Answer> findAll() {
        return answerDAO.findAll();
    }
}
