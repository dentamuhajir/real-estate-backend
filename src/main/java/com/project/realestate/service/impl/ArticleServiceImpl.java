package com.project.realestate.service.impl;

import com.project.realestate.model.Article;
import com.project.realestate.repository.ArticleRepository;
import com.project.realestate.service.ArticleService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ArticleServiceImpl implements ArticleService {
    @Override
    public String getHeadline() {
        return "passing value to controller from service";
    }
}
