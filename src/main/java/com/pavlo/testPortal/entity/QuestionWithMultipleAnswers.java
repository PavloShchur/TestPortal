package com.pavlo.testPortal.entity;

import lombok.*;

import javax.persistence.Entity;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class QuestionWithMultipleAnswers extends AbstractEntity {

    private String descriptionOfQuestion;

}
