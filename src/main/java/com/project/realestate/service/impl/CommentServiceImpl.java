package com.project.realestate.service.impl;

import com.project.realestate.dto.response.GenericResponse;
import com.project.realestate.repository.CommentRepository;
import com.project.realestate.service.CommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CommentServiceImpl implements CommentService {
    @Autowired
    private CommentRepository commentRepository;
    @Override
    public GenericResponse postComment() {
        return null;
    }
}
