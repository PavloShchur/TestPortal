package com.pavlo.testPortal.service;

import com.pavlo.testPortal.entity.Author;

import java.util.List;

public interface AuthorService {

    void save(String nameOfAuthor);
    void save(Author author);
    Author findOne(int id);
    List<Author> findAll();
}
