package com.pavlo.testPortal.DTO;


import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class BookAuthorDTO {

    private int idBook;
    private int idAuthor;
    private String titleOfBook;
    private String nameOfAuthor;
    private String surnameOfAuthor;

}
