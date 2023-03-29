package com.realestate.realestate;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;

@SpringBootApplication(exclude = { SecurityAutoConfiguration.class })
public class RealEstateApplication {

	public static void main(String[] args) {
		SpringApplication.run(RealEstateApplication.class, args);
	}

}
