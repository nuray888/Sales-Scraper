package com.example.salesscraper;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class SalesScraperApplication {

	public static void main(String[] args) {
		SpringApplication.run(SalesScraperApplication.class, args);
	}

}
