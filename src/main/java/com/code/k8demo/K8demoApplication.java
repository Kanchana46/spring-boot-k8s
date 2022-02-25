package com.code.k8demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class K8demoApplication {

	public static void main(String[] args) {
		SpringApplication.run(K8demoApplication.class, args);
	}
	
	@GetMapping("/hello")
	public String display() {
		return "Hello from Kubernetes!";
	}

}
