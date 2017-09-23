package com.pavlo.testPortal.dao;

import com.pavlo.testPortal.entity.Author;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AuthorDAO extends JpaRepository<Author, Integer> {


}
