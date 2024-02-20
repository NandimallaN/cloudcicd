package com.excelon;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringBootDockerWelcomeAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootDockerWelcomeAppApplication.class, args);
	}

	 @GetMapping("/wmsg")
	 public String welcomeMsg()
	 {
		 return "This is Spring boot app for docker Image and Container";
	 }
}
