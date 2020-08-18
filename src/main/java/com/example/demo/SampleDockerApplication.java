package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SampleDockerApplication {

	public static void main(String[] args) {
		SpringApplication.run(SampleDockerApplication.class, args);
	}
	
	@RequestMapping("/hello")
	  public String home() {
	    return "Hello Docker World";
	  }

}
