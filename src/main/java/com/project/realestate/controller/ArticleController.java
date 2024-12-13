package com.project.realestate.controller;

import com.project.realestate.service.ArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/article")
public class ArticleController {
    @Autowired
    private ArticleService articleService;
    @GetMapping(value = "/headline")
    public ResponseEntity<?> getHeadlineArticle() {
        String getHeadline = articleService.getHeadline();

        return new ResponseEntity<>(getHeadline, HttpStatus.OK);
    }
}
