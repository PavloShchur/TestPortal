package com.pavlo.testPortal.service.implementation;

import com.pavlo.testPortal.dao.BookDAO;
import com.pavlo.testPortal.entity.Book;
import com.pavlo.testPortal.entity.User;
import com.pavlo.testPortal.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class BookServiceImplementation implements BookService {

    @Autowired
    BookDAO bookDAO;

    @Override
    public void save(String titleOfBook) {
        bookDAO.save(new Book(titleOfBook));
    }

    @Override
    public void save(Book book) {
        bookDAO.save(book);
    }

    @Override
    public Book findOne(int id) {
        return bookDAO.findOne(id);
    }

    @Override
    public List<Book> findAll() {
        return bookDAO.findAll();
    }
}
