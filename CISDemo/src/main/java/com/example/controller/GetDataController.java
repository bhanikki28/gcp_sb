package com.example.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.dao.TestDao;
import com.example.entity.Test;

@RestController
@RequestMapping("/psp/v1")

public class GetDataController {
	
	private static Logger logger = LoggerFactory.getLogger(GetDataController.class);
	
	
	@Autowired
	private TestDao dao;

	@GetMapping(path = "/get")
	public void getData() {
		logger.debug("Inside getData");
		logger.info("Inside getData");
		Test test = dao.getData(1);
		logger.info("Test Name:"+test.getName());

	}

}
