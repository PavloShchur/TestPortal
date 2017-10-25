package com.pavlo.testPortal.controller.controllerREST;

import com.pavlo.testPortal.entity.Article;
import com.pavlo.testPortal.entity.User;
import com.pavlo.testPortal.service.ArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ArticleControllerREST {

    @Autowired
    ArticleService articleService;

    @PostMapping("/saveArticle")
    public void saveArticle(@RequestBody Article article) {

        articleService.save(article);

    }

    @GetMapping("/showArticle")
    public List<Article> show() {

        System.out.println("articleService.findAll() = " + articleService.findAll());

        return articleService.findAll();

    }
}
