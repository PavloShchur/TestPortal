package com.pavlo.testPortal.service;

import com.pavlo.testPortal.entity.Article;

import java.util.List;

public interface ArticleService {

    void save(Article article);

    void save(String titleOfArticle);

    Article findOne(int id);

    List<Article> findAll();

    void delete(int id);

    void deleteAll();

}
