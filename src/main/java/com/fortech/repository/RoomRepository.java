package com.fortech.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.fortech.model.Room;

@Repository
public interface RoomRepository extends CrudRepository<Room, Long>{

}
