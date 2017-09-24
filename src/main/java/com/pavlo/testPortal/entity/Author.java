package com.pavlo.testPortal.entity;

import lombok.*;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToOne;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString(exclude = "book")
public class Author extends AbstractEntity {

    private String nameOfAuthor;
    private String surnameOfAuthor;

    @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "")
    private Book book;

    public Author(String nameOfAuthor) {

    }
}
