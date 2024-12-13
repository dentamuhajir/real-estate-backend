package com.project.realestate.service.impl;

import com.project.realestate.model.Article;
import com.project.realestate.repository.ArticleRepository;
import com.project.realestate.service.ArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ArticleServiceImpl implements ArticleService {

    @Autowired
    private ArticleRepository articleRepository;
    @Override
    public List<Article> getHeadline() {
        List<Article> headline = articleRepository.fetchHeadline();
        return headline;
    }
}
