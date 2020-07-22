package com.praneeth;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class Test {

	public static void main(String[] args) {
		SpringApplication.run(Test.class, args);
	}

	@GetMapping("/")
	public String display() {
		return "welcome";
	}
}
