package com.pavlo.testPortal.service;

import com.pavlo.testPortal.entity.Book;
import com.pavlo.testPortal.entity.User;

import java.util.List;

public interface BookService {

    void save(String titleOfBook);
    void save(Book book);
    Book findOne(int id);
    List<Book> findAll();
    List<Book> fetchAuthor();
    List<Book> fetchAuthor(String maneOfAuthor);
}
