package com.pavlo.testPortal.entity;


import com.pavlo.testPortal.DAO.QuestionWithSingleAnswerDAO;
import lombok.*;

import javax.persistence.*;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString(exclude = "answer")
public class QuestionWithSingleAnswer extends AbstractEntity {

    private String descriptionOfQuestion;

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY,
            mappedBy = "questionWithSingleAnswer")
    private Answer answer;

    public QuestionWithSingleAnswer(QuestionWithSingleAnswerDAO questionWithSingleAnswerDAO) {
        super();
    }
}
