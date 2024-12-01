package com.project.realestate.model;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

import java.util.Date;

@Data
@Entity
@Table(name = "articles")
public class Article {
    @Id
    private Long id;
    private String title;
    private String category;
    private String contentBody;
    private String author;
    private String photographer;
    private Date publishedDate;
    private  Boolean isPublished;
}
