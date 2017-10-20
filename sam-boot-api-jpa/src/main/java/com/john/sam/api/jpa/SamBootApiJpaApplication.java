package com.john.sam.api.jpa;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.john.sam.api.jpa.model.Account;
import com.john.sam.api.jpa.model.AccountDAO;

@SpringBootApplication
@EnableAutoConfiguration
public class SamBootApiJpaApplication{

	private static final Logger logger = LoggerFactory.getLogger(SamBootApiJpaApplication.class);
	
	
	public static void main(String[] args) {
		System.setProperty("spring.devtools.restart.enabled", "false");
		SpringApplication.run(SamBootApiJpaApplication.class, args);
	}
	
    @Bean
    public CommandLineRunner commandLineRunner(AccountDAO accountDAO) {
    		return (args) -> {
    			accountDAO.save(new Account("seungil@gmail.com","guddy","1234"));
    			accountDAO.save(new Account("seungil@gmail.com","guddy1","1234"));
    			List<Account> list = accountDAO.findByEmail("seungil@gmail.com");
    			logger.debug("[LOG]");
    			logger.debug("=========account:"+ list.get(0).toString());
    		};
    }
}
