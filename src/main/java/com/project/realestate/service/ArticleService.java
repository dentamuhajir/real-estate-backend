package com.project.realestate.service;

import com.project.realestate.model.Article;

import java.util.List;


public interface ArticleService {
    public List<Article> getHeadline();
    public void seedingArticle(Integer totalData);
}
