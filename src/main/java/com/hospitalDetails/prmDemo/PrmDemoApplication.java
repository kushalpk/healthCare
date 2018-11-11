package com.hospitalDetails.prmDemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories
public class PrmDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(PrmDemoApplication.class, args);
	}
}
