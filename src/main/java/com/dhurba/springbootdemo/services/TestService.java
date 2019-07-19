package com.dhurba.springbootdemo.services;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class TestService {
	
	@Value("${info.build.artifact}")
	private String artifact;
	
	@Value("${info.build.name}")
	private String name;
	
	@Value("${info.build.description}")
	private String description;

	public void readValues() {
		System.out.println("Artifact = " + artifact+" Name: "+name+" description: "+description);
		
	}
}
