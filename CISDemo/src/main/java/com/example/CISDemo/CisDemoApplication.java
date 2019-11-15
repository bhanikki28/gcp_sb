package com.example.CISDemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.cloud.gcp.data.spanner.repository.config.EnableSpannerRepositories;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication(scanBasePackages="com.example")
@EnableScheduling
@ComponentScan(basePackages="com.example")
@EnableAutoConfiguration
@EnableConfigurationProperties
@EnableSpannerRepositories(basePackages="com.example")
public class CisDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(CisDemoApplication.class, args);
	}

}
