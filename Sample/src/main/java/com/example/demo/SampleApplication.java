package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SampleApplication {

	public static void main(String[] args) {
		SpringApplication.run(SampleApplication.class, args);
	}

	@GetMapping("/hello")
	public String hello() {
		return "안녕 Github Actions !11!!";
	}
	
	@GetMapping("/spring")
	public String spring() {
		return "봄!~!!!!!";
	}
}
