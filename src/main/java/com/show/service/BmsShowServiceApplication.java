package com.show.service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication
@EntityScan("com.show.service.entity")
public class BmsShowServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(BmsShowServiceApplication.class, args);
	}

}
