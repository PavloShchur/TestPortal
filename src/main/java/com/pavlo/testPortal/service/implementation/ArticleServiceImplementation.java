package com.pavlo.testPortal.service.implementation;

import com.pavlo.testPortal.dao.ArticleDAO;
import com.pavlo.testPortal.entity.Article;
import com.pavlo.testPortal.service.ArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

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

    @Override
    public Article findOne(int id) {

        return articleDAO.findOne(id);

    }

    @Override
    public List<Article> findAll() {

        return articleDAO.findAll();

    }

    @Override
    public void delete(int id) {

        articleDAO.delete(id);

    }

    @Override
    public void deleteAll() {

        articleDAO.findAll();

    }
}
