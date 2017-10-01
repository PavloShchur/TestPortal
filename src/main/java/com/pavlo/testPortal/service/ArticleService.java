package com.pavlo.testPortal.service;

import com.pavlo.testPortal.entity.Article;

public interface ArticleService {

    void save(Article article);
    void save(String titleOfArticle);
}
