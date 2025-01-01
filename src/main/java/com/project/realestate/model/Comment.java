package com.project.realestate.model;


import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@Entity
@Table(name = "comments", schema = "public")
public class Comment {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    @Column(name = "article_id", nullable = false)
    private long articleId;
    @Column(name = "comments")
    private long comments;
    @Column(name = "published_date")
    private LocalDateTime publishedDate;
}
