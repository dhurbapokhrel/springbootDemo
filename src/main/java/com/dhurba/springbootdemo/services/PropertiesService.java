package com.dhurba.springbootdemo.services;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Value;

public class PropertiesService {
	
	Logger logger = Logger.getLogger(PropertiesService.class);
	
	@Value("${info.build.artifact}")
	private String artifact;

	public void ReadProperties() {
	
		logger.info("Artifact "+ artifact);
	
	
	}
}
