package com.project.realestate.repository;

import com.project.realestate.model.Article;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface ArticleRepository extends JpaRepository<Article, Long> {
    @Query(value = "SELECT id, title, author, category, content_body, photo, photographer, published_date, is_published, created_at, updated_at FROM articles ORDER BY RAND() LIMIT 2", nativeQuery = true)
    List<Article> fetchHeadline();
}
