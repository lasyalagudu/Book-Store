package com.bookstore;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BookStoreSiteApplication {

	public static void main(String[] args) {
		SpringApplication.run(BookStoreSiteApplication.class, args);
		System.out.println("My app is running well!");
	}

}
