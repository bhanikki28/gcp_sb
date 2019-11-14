package com.example.CISDemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication(scanBasePackages="com.example")
@EntityScan(basePackages="com.example")
@EnableScheduling
public class CisDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(CisDemoApplication.class, args);
	}

}
