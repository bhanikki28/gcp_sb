package com.example.dao;

import org.springframework.stereotype.Component;

import com.example.entity.Test;

//@Component
public interface TestDao {
	
	 Test getData(int id);

}
