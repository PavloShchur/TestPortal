package com.pavlo.testPortal.entity;



import lombok.*;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@ToString()
public class User extends AbstractEntity {

    private String name;
    private String email;

}


