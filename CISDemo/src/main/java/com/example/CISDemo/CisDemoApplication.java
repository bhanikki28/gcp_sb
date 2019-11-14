package com.example.CISDemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication(scanBasePackages="com.example")
@EntityScan(basePackages="com.anz")
public class CisDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(CisDemoApplication.class, args);
	}

}
