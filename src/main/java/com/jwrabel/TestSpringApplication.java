package com.jwrabel;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TestSpringApplication {

	public static void main(String[] args) {
		SpringApplication.run(TestSpringApplication.class, args);
	}

	// REST
	// -R GET -> POBIERZ,  nie ma ciała!
	// -C POST -> STWORZENIA OBIEKTU,
	// -U PUT -> MODYFIKOWANIA
	// -D DELETE ->
}
