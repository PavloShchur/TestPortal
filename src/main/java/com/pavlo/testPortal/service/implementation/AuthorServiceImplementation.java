package com.pavlo.testPortal.service.implementation;

import com.pavlo.testPortal.dao.AuthorDAO;
import com.pavlo.testPortal.entity.Author;
import com.pavlo.testPortal.service.AuthorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class AuthorServiceImplementation implements AuthorService {

    @Autowired
    AuthorDAO authorDAO;

    @Override
    public void save(String nameOfAuthor) {
        authorDAO.save(new Author(nameOfAuthor));

    }

    @Override
    public void save(Author author) {
        authorDAO.save(author);
    }

    @Override
    public Author findOne(int id) {
        return authorDAO.findOne(id);
    }

    @Override
    public List<Author> findAll() {
        return authorDAO.findAll();
    }
}
