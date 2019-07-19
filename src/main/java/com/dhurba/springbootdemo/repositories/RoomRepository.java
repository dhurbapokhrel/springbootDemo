package com.dhurba.springbootdemo.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.dhurba.springbootdemo.entities.RoomEntity;

@Repository
public interface RoomRepository extends CrudRepository<RoomEntity, Long> {
	RoomEntity findByNumber(Integer number);

}
