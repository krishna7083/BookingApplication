package com.hotel.booking.repository;

import com.hotel.booking.entity.Rooms;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository("roomsRepository")
public interface RoomsRepository extends CrudRepository<Rooms,Integer> {
    
}
