package com.example.SearchCity;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.elasticsearch.repository.config.EnableElasticsearchRepositories;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories(basePackages = "com.example.SearchCity.repository.jpa")
public class SearchCityApplication {

	public static void main(String[] args) {
		SpringApplication.run(SearchCityApplication.class, args);
	}

}
