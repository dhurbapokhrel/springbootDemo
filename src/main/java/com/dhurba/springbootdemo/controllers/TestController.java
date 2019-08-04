package com.dhurba.springbootdemo.controllers;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.dhurba.springbootdemo.services.TestService;

@RestController
@RequestMapping(value = "/test")
public class TestController {
	
	Logger loger =Logger.getLogger(TestController.class);
	
	@Autowired
	private TestService testService;

	@RequestMapping(value = "/properties", method = RequestMethod.GET)
	public void readProperties() {
		loger.info("entered test controller");
		testService.readValues();
	}
	
}
