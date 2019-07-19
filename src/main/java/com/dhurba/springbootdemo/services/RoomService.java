package com.dhurba.springbootdemo.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dhurba.springbootdemo.dtos.RoomDto;
import com.dhurba.springbootdemo.entities.RoomEntity;
import com.dhurba.springbootdemo.entities.RoomEntity.Type;
import com.dhurba.springbootdemo.repositories.RoomRepository;

@Service
public class RoomService {
	@Autowired
	private RoomRepository rm;
	
	public void saveRoom(RoomDto roomDto) {
		if(roomDto!= null) {
			RoomEntity roomEntity = rm.findByNumber(roomDto.getNumber());
			if(roomEntity==null) {
				RoomEntity addroom = new RoomEntity();
				addroom.setNumber(roomDto.getNumber());
				addroom.setTypeDescription(roomDto.getDescription());
				addroom.setWifiAvailable(roomDto.getWifiAvailable());
				addroom.setIsSmoking(roomDto.getIsSmoking());
				addroom.setBasePrice(roomDto.getPrice());
				addroom.setType(Type.valueOf(roomDto.getType()));
				rm.save(addroom);
				
				
			}else {
				System.out.println(roomDto.getNumber()+ "Room is already exists.");
			}
		}else {
			System.out.println("RoomDto is null.");
		}
		
	}
	

}
