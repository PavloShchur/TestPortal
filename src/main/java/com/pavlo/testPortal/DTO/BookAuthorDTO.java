package com.pavlo.testPortal.DTO;


import lombok.*;


public class BookAuthorDTO {

    private int idBook;
    private int idAuthor;
    private String titleOfBook;
    private String nameOfAuthor;
    private String surnameOfAuthor;

    public BookAuthorDTO(int idBook, int idAuthor, String titleOfBook, String nameOfAuthor, String surnameOfAuthor) {
        this.idBook = idBook;
        this.idAuthor = idAuthor;
        this.titleOfBook = titleOfBook;
        this.nameOfAuthor = nameOfAuthor;
        this.surnameOfAuthor = surnameOfAuthor;
    }


    public BookAuthorDTO() {
    }

    public int getIdBook() {
        return idBook;
    }

    public void setIdBook(int idBook) {
        this.idBook = idBook;
    }

    public int getIdAuthor() {
        return idAuthor;
    }

    public void setIdAuthor(int idAuthor) {
        this.idAuthor = idAuthor;
    }

    public String getTitleOfBook() {
        return titleOfBook;
    }

    public void setTitleOfBook(String titleOfBook) {
        this.titleOfBook = titleOfBook;
    }

    public String getNameOfAuthor() {
        return nameOfAuthor;
    }

    public void setNameOfAuthor(String nameOfAuthor) {
        this.nameOfAuthor = nameOfAuthor;
    }

    public String getSurnameOfAuthor() {
        return surnameOfAuthor;
    }

    public void setSurnameOfAuthor(String surnameOfAuthor) {
        this.surnameOfAuthor = surnameOfAuthor;
    }

    @Override
    public String toString() {
        return "BookAuthorDTO{" +
                "idBook=" + idBook +
                ", idAuthor=" + idAuthor +
                ", titleOfBook='" + titleOfBook + '\'' +
                ", nameOfAuthor='" + nameOfAuthor + '\'' +
                ", surnameOfAuthor='" + surnameOfAuthor + '\'' +
                '}';
    }
}
