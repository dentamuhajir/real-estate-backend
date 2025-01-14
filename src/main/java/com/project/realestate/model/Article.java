package com.project.realestate.model;


import jakarta.persistence.*;
import lombok.Data;
import lombok.ToString;

import java.time.LocalDateTime;
import java.util.List;

@Data
@Entity
@Table(name = "articles", schema = "public")
@ToString(exclude = "commentList")
public class Article {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column(name = "title", nullable = false)
    private String title;
    @Column(name = "category", nullable = false)
    private String category;
    @Column(name = "content_body", nullable = false)
    private String contentBody;
    @Column(name = "photo")
    private String photo;
    @Column(name = "author")
    private String author;
    @Column(name = "photographer")
    private String photographer;
    @Column(name = "published_date")
    private LocalDateTime publishedDate;
    @Column(name = "is_published", nullable = false)
    private Boolean isPublished;
    @Column(name= "created_at", updatable = false)
    private LocalDateTime createdAt;
    @Column(name="updated_at")
    private  LocalDateTime updatedAt;

    @OneToMany(mappedBy = "article")
    private List<Comment> commentList;
}
