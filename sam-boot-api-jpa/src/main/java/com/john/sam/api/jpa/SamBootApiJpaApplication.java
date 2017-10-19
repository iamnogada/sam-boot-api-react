package com.john.sam.api.jpa;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableAutoConfiguration
public class SamBootApiJpaApplication {

	public static void main(String[] args) {
		SpringApplication.run(SamBootApiJpaApplication.class, args);
	}
}
