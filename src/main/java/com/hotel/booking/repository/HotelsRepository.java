package com.hotel.booking.repository;

import com.hotel.booking.entity.Hotels;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository("hotelsRepository")
public interface HotelsRepository extends CrudRepository<Hotels, Integer> {
    
}
