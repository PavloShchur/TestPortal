package com.pavlo.testPortal.service.implementation;

import com.pavlo.testPortal.dao.ArticleDAO;
import com.pavlo.testPortal.entity.Article;
import com.pavlo.testPortal.service.ArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class ArticleServiceImplementation implements ArticleService {

    @Autowired
    ArticleDAO articleDAO;

    @Override
    public void save(Article article) {
        articleDAO.save(article);
    }

    @Override
    public void save(String titleOfArticle) {
        Article article = new Article(titleOfArticle);
        articleDAO.save(article);
    }
}
