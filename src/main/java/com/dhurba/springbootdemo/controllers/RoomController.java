package com.dhurba.springbootdemo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.dhurba.springbootdemo.dtos.RoomDto;
import com.dhurba.springbootdemo.services.RoomService;

@RestController
@RequestMapping(value="/rooms")
public class RoomController {
	
	@Autowired
	private RoomService rs;
	
	@RequestMapping(value="", method=RequestMethod.POST)
	public void save(@RequestBody RoomDto roomDto) {
		rs.saveRoom(roomDto);
		
	}

}
