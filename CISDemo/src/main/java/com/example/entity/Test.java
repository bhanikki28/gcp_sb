package com.example.entity;

import org.springframework.cloud.gcp.data.spanner.core.mapping.Column;
import org.springframework.cloud.gcp.data.spanner.core.mapping.PrimaryKey;
import org.springframework.cloud.gcp.data.spanner.core.mapping.Table;

@Table(name = "test_table")
public class Test {
	
	@PrimaryKey
	private int id;

	@Column(name = "name")
	public String name;


}
