package com.example.restservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

// @Configuration within SpringBootConfiguration, @EnableAutoConfiguration, @ComponentScan
@SpringBootApplication
public class RestServiceApplication {

	public static void main(String[] args) {
		// SpringApplication.run()  method to launch an application.
		SpringApplication.run(RestServiceApplication.class, args);
	}

}
