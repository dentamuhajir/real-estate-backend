package com.project.realestate.dto.comment;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class CommentPostReq {
    private String comments;
    private Long articleId;
}
