package com.example.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.dao.TestRepository;
import com.example.entity.Test;

@RestController
@RequestMapping("/psp/v1")

public class GetDataController {
	
	private static Logger logger = LoggerFactory.getLogger(GetDataController.class);
	
	
	@Autowired
	TestRepository testRepository;

	@GetMapping(path = "/get")
    //@Scheduled(fixedRateString = "250")
	public String getData() {
		logger.debug("Inside getData");
		logger.info("Inside getData");
		List<Test> test = this.testRepository.findById(1);
		Test test1 = test.get(0);
		logger.info("Test Name:"+test1.name);
		return test1.name;

	}

}
