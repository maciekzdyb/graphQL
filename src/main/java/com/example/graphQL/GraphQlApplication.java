package com.example.graphQL;

import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.List;

@SpringBootApplication
public class GraphQlApplication {

	public static void main(String[] args) {
		SpringApplication.run(GraphQlApplication.class, args);
	}

	@Bean
	ApplicationRunner applicationRunner(AuthorRepository authorRepository, BookRepository bookRepository){
		return args -> {
			Author josh = authorRepository.save(new Author(1L,"Josh"));
			Author mark = authorRepository.save(new Author(2L,"Mark"));
			bookRepository.saveAll(List.of(
				new Book("Title1","Publisher1",josh),
				new Book("Title2","Publisher1", mark),
				new Book("Title3", "Publisher3", josh)
			));
		};
	}
}

