package com.project.realestate.controller;

import com.project.realestate.service.CommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/comment")
public class CommentController {
    @Autowired
    private CommentService commentService;

}
