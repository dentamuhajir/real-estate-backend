package com.project.realestate.controller;

import com.project.realestate.dto.comment.CommentPostReq;
import com.project.realestate.dto.response.GenericResponse;
import com.project.realestate.service.CommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("api/comment")
public class CommentController {
    @Autowired
    private CommentService commentService;

    @PostMapping(value = "/post")
    public ResponseEntity<?> postComment(@RequestBody CommentPostReq commentPost) {
        System.out.println(commentPost);
        GenericResponse postComment = commentService.postComment(commentPost);
        return new ResponseEntity<>(postComment, HttpStatus.OK);
    }

}
