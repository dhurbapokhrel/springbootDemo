package com.dhurba.springbootdemo.services;


import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dhurba.springbootdemo.dtos.RoomDto;
import com.dhurba.springbootdemo.entities.RoomEntity;
import com.dhurba.springbootdemo.entities.RoomEntity.Type;
import com.dhurba.springbootdemo.repositories.RoomRepository;

@Service
public class RoomService {
	
	Logger logger = Logger.getLogger(RoomService.class);
	
	@Autowired
	private RoomRepository rm;
	
	public void saveRoom(RoomDto roomDto) {
		if(roomDto!= null) {
			RoomEntity roomEntity = rm.findByNumber(roomDto.getNumber());
			if(roomEntity==null) {
				RoomEntity addroom = new RoomEntity();
				addroom.setNumber(roomDto.getNumber());
				logger.debug("debug: type:" +Type.valueOf(roomDto.getType()));
				logger.info("info: type:"  + Type.valueOf(roomDto.getType()));
				logger.warn("warn : type:" +Type.valueOf(roomDto.getType()));
				addroom.setTypeDescription(roomDto.getDescription());
				addroom.setWifiAvailable(roomDto.getWifiAvailable());
				addroom.setIsSmoking(roomDto.getIsSmoking());
				addroom.setBasePrice(roomDto.getPrice());
				addroom.setType(Type.valueOf(roomDto.getType()));
				rm.save(addroom);
				
				
			}else {
				logger.warn(roomDto.getNumber()+ "Room is already exists.");
			}
		}else {
			logger.error("RoomDto is null.");
		}
		
	}
	public RoomDto getRoomByNumber(Integer number) {
		RoomEntity roomEntity=rm.findByNumber(number);
		RoomDto roomDto = null;
		if(roomEntity==null) {
			logger.warn("Room number "+ number +" does not exists.");
		}else {
			roomDto=new RoomDto();
			roomDto.setNumber(roomEntity.getNumber());
			roomDto.setDescription(roomEntity.getTypeDescription());
			roomDto.setIsSmoking(roomEntity.getIsSmoking());
			roomDto.setWifiAvailable(roomEntity.getWifiAvailable());
			roomDto.setType(roomEntity.getType().toString());
			roomDto.setPrice(roomEntity.getBasePrice());
		}
		
		return roomDto;
	
	
	}
}
