package com.pavlo.testPortal.entity;

import lombok.*;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToOne;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString(exclude = "questionWithSingleAnswer")
public class Answer extends AbstractEntity {

    private String descriptionOfAnswer;
    private int rankOfAnswer;

    @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private QuestionWithSingleAnswer questionWithSingleAnswer;

    public Answer(String descriptionOfAnswer) {

    }

    public Answer(String descriptionOfAnswer, int rankOfAnswer) {
        this.descriptionOfAnswer = descriptionOfAnswer;
        this.rankOfAnswer = rankOfAnswer;
    }
}
