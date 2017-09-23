package com.pavlo.testPortal.entity;

import lombok.*;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.ManyToOne;
import java.util.HashSet;
import java.util.Set;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString(exclude = "sphereOfIT")
public class Article extends AbstractEntity {


    private String titleOfArticle;

    @ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private SphereOfIT sphereOfIT;

}

