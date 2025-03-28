package com.project.realestate.service;


import com.project.realestate.dto.article.ArticleByCategoryResp;
import com.project.realestate.dto.article.HeadlineArticleResp;
import com.project.realestate.dto.response.GenericResponse;
import com.project.realestate.model.Article;

import java.util.List;
import java.util.Map;


public interface ArticleService {

    public GenericResponse getHeadline();
    public GenericResponse getListArticleByCategories();
    public void seedingArticle(Integer totalData);
    public GenericResponse getArticleById(Long articleId);

    public GenericResponse delete(Long id);

}
