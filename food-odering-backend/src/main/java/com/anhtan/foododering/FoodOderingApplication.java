package com.anhtan.foododering;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.logging.Logger;

@SpringBootApplication
public class FoodOderingApplication {

	public static void main(String[] args) {

        var logger = Logger.getLogger(FoodOderingApplication.class.getName());
		logger.info("Starting FoodOderingApplication");

		SpringApplication.run(FoodOderingApplication.class, args);
	}

}
