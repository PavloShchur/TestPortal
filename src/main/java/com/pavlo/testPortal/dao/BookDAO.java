package com.pavlo.testPortal.dao;

import com.pavlo.testPortal.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookDAO extends JpaRepository<Book, Integer> {
}
