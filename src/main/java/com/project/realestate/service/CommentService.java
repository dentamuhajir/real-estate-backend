package com.project.realestate.service;

import com.project.realestate.dto.comment.CommentPostReq;
import com.project.realestate.dto.response.GenericResponse;

public interface CommentService {
    public GenericResponse postComment(CommentPostReq commentPost);
}
