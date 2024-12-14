package com.project.realestate.dto.article;

import jakarta.persistence.Column;
import lombok.Builder;
import lombok.Data;

import java.time.LocalDateTime;

@Data
public class HeadlineArticleResp {
    private Long id;
    private String title;
    private String category;
    private String photo;
}
