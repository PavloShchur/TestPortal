package com.pavlo.testPortal.controller.controllerREST;

import com.pavlo.testPortal.entity.Article;
import com.pavlo.testPortal.service.ArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ArticleControllerREST {

    @Autowired
    ArticleService articleService;

    @PostMapping("/saveArticle")
    public void saveArticle(@RequestBody Article article) {
        articleService.save(article);
    }
}
