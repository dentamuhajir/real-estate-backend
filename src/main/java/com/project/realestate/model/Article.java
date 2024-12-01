package com.project.realestate.model;


import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;

@Data
@Entity
@Table(name = "articles", schema = "public")
public class Article {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column(name = "title")
    private String title;
    @Column(name = "category")
    private String category;
    @Column(name = "content_body")
    private String contentBody;
    @Column(name = "photo")
    private String photo;
    @Column(name = "author")
    private String author;
    @Column(name = "photographer")
    private String photographer;
    @Column(name = "published_date")
    private Date publishedDate;
    @Column(name = "is_published")
    private Boolean isPublished;
}
