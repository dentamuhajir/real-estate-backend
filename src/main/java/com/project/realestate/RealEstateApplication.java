package com.project.realestate;

import com.github.javafaker.Faker;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class RealEstateApplication implements CommandLineRunner {
	public void run(String args[]) throws Exception
	{
		Faker faker = new Faker();
		for (int i = 0; i < 10; i++) { // Generate 10 articles
			System.out.println("title : " + faker.book().title());
			System.out.println("content : " + faker.lorem().paragraph());
			System.out.println("author : " + faker.name().fullName());
			System.out.println("image : " + "https://picsum.photos/seed/" + faker.number().numberBetween(1, 1001) + "/600/400");
		}
		System.out.println("Command Line Runner Execute");
	}

	public static void main(String[] args) {
		SpringApplication.run(RealEstateApplication.class, args);
	}

}
