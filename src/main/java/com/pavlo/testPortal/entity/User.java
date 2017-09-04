package com.pavlo.testPortal.entity;



import lombok.*;

import javax.persistence.Entity;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class User extends AbstractEntity {

    private String name;
    private String email;
    private String password;



}


