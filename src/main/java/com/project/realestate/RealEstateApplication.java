package com.project.realestate;

import com.github.javafaker.Faker;
import com.project.realestate.model.Article;
import com.project.realestate.repository.ArticleRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.concurrent.TimeUnit;

@SpringBootApplication
public class RealEstateApplication implements CommandLineRunner {

	private ArticleRepository articleRepository;

	public RealEstateApplication(ArticleRepository articleRepository) {
		this.articleRepository = articleRepository;
	}
	public void run(String args[]) throws Exception
	{
//		Faker faker = new Faker();
//
//		List<String> genres = new ArrayList<>();
//		for (int i = 0; i < 3; i++) {
//			genres.add(faker.lorem().word());
//		}
//
//		for (int i = 0; i < 60; i++) {
//			Article article = new Article();
//			article.setTitle(faker.lorem().sentence(4));
//			String randomCategory = genres.get(faker.number().numberBetween(0, genres.size()));
//			article.setCategory(randomCategory);
//			article.setContentBody(faker.lorem().paragraph());
//			article.setAuthor(faker.name().fullName());
//			article.setPhotographer(faker.funnyName().name());
//			article.setPhoto("https://picsum.photos/seed/" + faker.number().numberBetween(1, 1001) + "/600/400");
//			Date randomDate = faker.date().past(20 * 365, TimeUnit.DAYS);
//			LocalDateTime publishedDate = LocalDateTime.ofInstant(randomDate.toInstant(), ZoneId.systemDefault());
//			article.setPublishedDate(publishedDate);
//			article.setIsPublished(true);
//			articleRepository.save(article);
//		}
	}

	public static void main(String[] args) {
		SpringApplication.run(RealEstateApplication.class, args);
	}

}
