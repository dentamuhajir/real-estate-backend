package com.project.realestate.model;


import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@Entity
@Table(name = "comments", schema = "public")
public class Comment {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column(name = "comments")
    private String comments;
    @Column(name = "published_date")
    private LocalDateTime publishedDate;

    @ManyToOne
    @JoinColumn(name = "article_id", nullable = false)
    @JsonIgnore
    private Article article;

}
