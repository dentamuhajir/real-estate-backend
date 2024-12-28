package com.project.realestate.controller;

import com.project.realestate.dto.article.ArticleByCategoryResp;
import com.project.realestate.dto.article.HeadlineArticleResp;
import com.project.realestate.dto.response.GenericResponse;
import com.project.realestate.model.Article;
import com.project.realestate.service.ArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("api/article")
public class ArticleController {
    @Autowired
    private ArticleService articleService;
    @GetMapping(value = "/headline")
    public ResponseEntity<?> getHeadlineArticle() {
        GenericResponse headline = articleService.getHeadline();
        return new ResponseEntity<>(headline, HttpStatus.OK);
    }

    @GetMapping(value = "/list")
    public  ResponseEntity<?> getListArticle() {
        GenericResponse listArticle = articleService.getListArticleByCategories();
        return new ResponseEntity<>(listArticle, HttpStatus.OK);
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<?> getDetailArticle(@PathVariable Long id) {
        GenericResponse detailArticle = articleService.getArticleById(id);
        return new ResponseEntity<>(detailArticle, HttpStatus.OK);
    }
    @GetMapping(value= "/seed/{totalData}")
    public  ResponseEntity<?> seedingDummyArticles(@PathVariable Integer totalData) {
        articleService.seedingArticle(totalData);
        return new ResponseEntity<>("Seeding " + totalData + " dummy articles", HttpStatus.OK);
    }

}
