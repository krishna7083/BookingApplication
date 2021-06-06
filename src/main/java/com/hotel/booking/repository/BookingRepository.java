package com.hotel.booking.repository;

import com.hotel.booking.entity.Booking;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository("bookingRepository")
public interface BookingRepository extends CrudRepository<Booking,Integer> {
    
}
