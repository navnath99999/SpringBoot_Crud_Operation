package com.cjc.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EntityScan
@EnableJpaRepositories
public class SpringBoot147CrudApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBoot147CrudApplication.class, args);
		System.out.println("Program Run sucessfully");
	}

}
