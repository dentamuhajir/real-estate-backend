package com.project.realestate.service;


import com.project.realestate.dto.article.HeadlineArticleResp;
import com.project.realestate.dto.response.GenericResponse;
import com.project.realestate.model.Article;

import java.util.List;


public interface ArticleService {

    public GenericResponse getHeadline();
    public void seedingArticle(Integer totalData);
}
