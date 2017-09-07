package com.pavlo.testPortal.entity;

import lombok.*;

import javax.persistence.*;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString(exclude = "descriptionOfAnswer")
public class Answer extends AbstractEntity {

    private String descriptionOfAnswer;

    @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private QuestionWithSingleAnswer questionWithSingleAnswer;

    public Answer(String descriptionOfAnswer) {

    }
}
