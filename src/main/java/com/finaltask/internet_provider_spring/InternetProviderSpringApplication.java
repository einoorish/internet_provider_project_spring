package com.finaltask.internet_provider_spring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;

@SpringBootApplication(exclude = { SecurityAutoConfiguration.class })
public class InternetProviderSpringApplication {

	public static void main(String[] args) {
		SpringApplication.run(InternetProviderSpringApplication.class, args);
	}

}
