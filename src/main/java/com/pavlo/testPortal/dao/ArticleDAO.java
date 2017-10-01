package com.pavlo.testPortal.dao;

import com.pavlo.testPortal.entity.Article;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ArticleDAO extends JpaRepository<Article, Integer> {
}
