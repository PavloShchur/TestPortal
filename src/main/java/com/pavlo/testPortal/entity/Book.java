package com.pavlo.testPortal.entity;

import lombok.*;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToOne;

@Entity
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@ToString(exclude = "author")
public class Book extends AbstractEntity {

    private String titleOfBook;
    private int priceOfBook;
    private short yearOfPublishing;
    private String pathImage;
    private int quantity;

    @OneToOne()
    private Author author;


    public Book(String titleOfBook) {

    }
}
