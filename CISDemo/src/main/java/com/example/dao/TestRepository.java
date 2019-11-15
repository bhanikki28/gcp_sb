package com.example.dao;

import java.util.List;

import org.springframework.cloud.gcp.data.spanner.repository.SpannerRepository;

import com.example.entity.Test;
import com.google.cloud.spanner.Key;


public interface TestRepository extends SpannerRepository<Test, Key> {
	  List<Test> findById(int id);
}