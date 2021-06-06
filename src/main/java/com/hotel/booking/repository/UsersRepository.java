package com.hotel.booking.repository;

import com.hotel.booking.entity.Users;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository("usersRepository")
public interface UsersRepository extends CrudRepository<Users,Integer> {
    
}
