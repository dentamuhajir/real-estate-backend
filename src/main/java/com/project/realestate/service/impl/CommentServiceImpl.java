package com.project.realestate.service.impl;

import com.project.realestate.dto.comment.CommentPostReq;
import com.project.realestate.dto.response.GenericResponse;
import com.project.realestate.model.Article;
import com.project.realestate.model.Comment;
import com.project.realestate.repository.ArticleRepository;
import com.project.realestate.repository.CommentRepository;
import com.project.realestate.service.CommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.Optional;

@Service
public class CommentServiceImpl implements CommentService {
    @Autowired
    private CommentRepository commentRepository;
    @Autowired
    private ArticleRepository articleRepository;

    @Override
    public GenericResponse postComment(@RequestBody CommentPostReq commentPost) {
        Comment comment = new Comment();
        Article article = articleRepository.findById(commentPost.getArticleId()).get();
        System.out.println(article);
        comment.setComments(commentPost.getComments());
        comment.setArticle(article);
        commentRepository.save(comment);

        return GenericResponse.builder()
                .code(200)
                .status("SUCCESS")
                .message("")
                .data("")
                .build();
    }
}
