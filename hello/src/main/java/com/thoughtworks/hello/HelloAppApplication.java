package com.thoughtworks.hello;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class HelloAppApplication {

	@GetMapping("/greet")
	public String greet(){
		return "Hello";
	}

	public static void main(String[] args) {
		SpringApplication.run(HelloAppApplication.class, args);
	}

}
