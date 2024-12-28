package com.project.realestate.dto.article;

import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class ArticleResp {
    private Long id;
    private String title;
    private String category;
    private String photo;
}
