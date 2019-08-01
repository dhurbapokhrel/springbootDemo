package com.dhurba.springbootdemo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.dhurba.springbootdemo.services.TestService;

@RestController
@RequestMapping(value = "/test")
public class TestController {
	
	@Autowired
	private TestService testService;

	@RequestMapping(value = "/properties", method = RequestMethod.GET)
	public void readProperties() {
		testService.readValues();
	}
	
}
