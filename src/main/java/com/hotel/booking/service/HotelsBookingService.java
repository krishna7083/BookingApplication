package com.hotel.booking.service;

import java.util.List;

import com.hotel.booking.entity.Hotels;
import com.hotel.booking.entity.HotelsRequest;
import com.hotel.booking.entity.ReviewAndCommentResponse;
import com.hotel.booking.entity.Reviews;
import com.hotel.booking.entity.Users;
/**
 * This is the Interface which contains all the details 
 */
public interface HotelsBookingService {

    public List<Hotels> getRequestedHotels(HotelsRequest hotelRequest);

    public List<ReviewAndCommentResponse> getReviewAndCommentOfHotels(int hotelId);

    public void saveHotel(Hotels hotel);

    public void updateHotel(Hotels hotel);

    public void saveUser(Users user);

    public void updateUser(Users user);

    public void addReviewForHotel(Reviews reviews);

    public void deleteHotel(int hotelId);

    public void deleteUser(int userId);
    
}
