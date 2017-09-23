package com.pavlo.testPortal.entity;

import lombok.*;

import javax.persistence.Entity;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString(exclude = "articles")
public class Author extends AbstractEntity {

    private String nameOfAuthor;
    private String surnameOfAuthor;

}
