package com.pavlo.testPortal.entity;

import lombok.*;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class SphereOfIT extends AbstractEntity {

    private String nameOfShereOfIT;

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "sphereOfIT")
    private Set<Article> articles = new HashSet<Article>();
}
