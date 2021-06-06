package com.hotel.booking.repository;

import com.hotel.booking.entity.Reviews;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository("reviewsRepository")
public interface ReviewsRepository extends CrudRepository<Reviews,Integer> {
    
}
