package com.centennial.microservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class SpringBootJpaMicroServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootJpaMicroServiceApplication.class, args);
		System.setProperty("spring.config.name", "super-employee-service");
		System.out.println("select-customer-service is ready....");	
	}

}
