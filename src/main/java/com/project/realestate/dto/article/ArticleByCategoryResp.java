package com.project.realestate.dto.article;

import lombok.Builder;
import lombok.Data;

import java.util.List;

@Builder
@Data
public class ArticleByCategoryResp {
    private String category;
    private List<ArticleResp> articleList;
}
