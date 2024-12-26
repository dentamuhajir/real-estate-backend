package com.project.realestate.service.impl;

import com.github.javafaker.Faker;
import com.project.realestate.dto.article.HeadlineArticleResp;

import com.github.javafaker.Faker;

import com.project.realestate.dto.response.GenericResponse;
import com.project.realestate.model.Article;
import com.project.realestate.repository.ArticleRepository;
import com.project.realestate.service.ArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.*;
import java.util.concurrent.TimeUnit;
import java.util.stream.Collectors;

@Service
public class ArticleServiceImpl implements ArticleService {

    @Autowired
    private ArticleRepository articleRepository;
    public GenericResponse<Object> getHeadline() {
        List<Article> articles = articleRepository.fetchHeadline();
        List<HeadlineArticleResp> headlines = new ArrayList<>();

        for(Article article : articles) {
          headlines.add(HeadlineArticleResp.builder()
                  .id(article.getId())
                  .title(article.getTitle())
                  .category(article.getCategory())
                  .photo(article.getPhoto()).
                  build());
        }

        return GenericResponse.builder()
                .status("SUCCESS")
                .code(200)
                .message("")
                .data(headlines)
                .build();
    }

    @Override
    public void getListArticleByCategories() {
        List<Article> articles = articleRepository.findAll();
        Set<String> categories = articles.stream().map(Article::getCategory).collect(Collectors.toSet());

        for(String category : categories) {
            for(Article article : articles) {
                if(article.getCategory().equals(category)) {
                    //
                }
            }
        }
    }

    @Override
    public void seedingArticle(Integer totalData) {
        Faker faker = new Faker();

        List<String> genres = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
          genres.add(faker.lorem().word());
        }

        for (int i = 0; i < totalData; i++) {
          Article article = new Article();
          article.setTitle(faker.lorem().sentence(4));
          String randomCategory = genres.get(faker.number().numberBetween(0, genres.size()));
          article.setCategory(randomCategory);
          article.setContentBody(faker.lorem().paragraph());
          article.setAuthor(faker.name().fullName());
          article.setPhotographer(faker.funnyName().name());
          article.setPhoto("https://picsum.photos/seed/" + faker.number().numberBetween(1, 1001) + "/600/400");
          Date randomDate = faker.date().past(20 * 365, TimeUnit.DAYS);
          LocalDateTime publishedDate = LocalDateTime.ofInstant(randomDate.toInstant(), ZoneId.systemDefault());
          article.setPublishedDate(publishedDate);
          article.setIsPublished(true);
          articleRepository.save(article);
        }
    }
}
