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
public class Author extends AbstractEntity {

    private String nameOfAuthor;
    private String surnameOfAuthor;

    @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER, mappedBy = "author")
    private Book book;

    public Author(String nameOfAuthor, String surnameOfAuthor) {
        this.nameOfAuthor = nameOfAuthor;
        this.surnameOfAuthor = surnameOfAuthor;
    }

    public Author() {
    }

    public Author(String nameOfAuthor, String surnameOfAuthor, Book book) {
        this.nameOfAuthor = nameOfAuthor;
        this.surnameOfAuthor = surnameOfAuthor;
        this.book = book;
    }

    public Author(String nameOfAuthor) {
        this.nameOfAuthor = nameOfAuthor;
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

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }

    @Override
    public String toString() {
        return "Author{" +
                "nameOfAuthor='" + nameOfAuthor + '\'' +
                ", surnameOfAuthor='" + surnameOfAuthor + '\'' +
                ", book=" + book +
                '}';
    }
}
