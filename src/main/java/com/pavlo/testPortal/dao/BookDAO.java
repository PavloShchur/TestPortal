package com.pavlo.testPortal.dao;

import com.pavlo.testPortal.entity.Author;
import com.pavlo.testPortal.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface BookDAO extends JpaRepository<Book, Integer> {

    @Query("select b from Book b join fetch b.author")
    public List<Book> fetchAuthor();

    @Query("from Book b join fetch b.author where b.author.nameOfAuthor = :nameOfAuthor")
    public List<Book> fetchAuthor(@Param("nameOfAuthor") String nameOfAuthor);

}
