package com.project.realestate.controller;

import com.project.realestate.dto.article.HeadlineArticleResp;
import com.project.realestate.model.Article;
import com.project.realestate.service.ArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/article")
public class ArticleController {
    @Autowired
    private ArticleService articleService;
    @GetMapping(value = "/headline")
    public ResponseEntity<?> getHeadlineArticle() {
        List<HeadlineArticleResp> getHeadline = articleService.getHeadline();
        return new ResponseEntity<>(getHeadline, HttpStatus.OK);
    }
    @GetMapping(value= "/seed/{totalData}")
    public  ResponseEntity<?> seedingDummyArticles(@PathVariable Integer totalData) {
        articleService.seedingArticle(totalData);
        return new ResponseEntity<>("Seeding " + totalData + " dummy articles", HttpStatus.OK);
    }
}
