package com.learn.gatling.tanmay.TryGatling;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = {"com.learn"})
public class TryGatlingApplication {

	public static void main(String[] args) {
		SpringApplication.run(TryGatlingApplication.class, args);
	}
}
