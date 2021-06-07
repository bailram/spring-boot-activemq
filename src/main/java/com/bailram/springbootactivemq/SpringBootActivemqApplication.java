package com.bailram.springbootactivemq;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "com.bailram.*")
public class SpringBootActivemqApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootActivemqApplication.class, args);
	}

}
