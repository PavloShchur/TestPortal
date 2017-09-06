package com.pavlo.testPortal.DAO;

import com.pavlo.testPortal.entity.QuestionWithSingleAnswer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface QuestionWithSingleAnswerDAO
        extends JpaRepository<QuestionWithSingleAnswer, Integer> {

}
