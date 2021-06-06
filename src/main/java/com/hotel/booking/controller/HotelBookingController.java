package com.hotel.booking.controller;

/**
 * Controller class which will call the service to get the requested details
 * for a called endpoints. This class contains all the endpoints which need 
 * to be implemented.
 * @author Krushna Oza
 */
import java.util.List;

import com.hotel.booking.entity.Hotels;
import com.hotel.booking.entity.HotelsRequest;
import com.hotel.booking.entity.ReviewAndCommentResponse;
import com.hotel.booking.entity.Reviews;
import com.hotel.booking.entity.Users;
import com.hotel.booking.service.HotelsBookingService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HotelBookingController {

    @Autowired
    private HotelsBookingService hotelsBookingService;

    /**
     * This method looks for the hotels as per user requested factors.
     * @param hotelRequest
     * @return list of reqested hotels
     */
    @PostMapping("/searchHotels")
    public List<Hotels> getRequestedHotels(@RequestBody HotelsRequest hotelRequest) {
        
        return hotelsBookingService.getRequestedHotels(hotelRequest);

    }

    @PostMapping("/getReviewAndComments/{hotelId}")
    public List<ReviewAndCommentResponse> getReviewAndComment(@PathVariable("hotelId") int hotelId) {
         
        return hotelsBookingService.getReviewAndCommentOfHotels(hotelId);
    }

    @PostMapping("/savehotel")
    public void saveHotel(@RequestBody Hotels hotel) {
        hotelsBookingService.saveHotel(hotel);
        
    }

    @PutMapping("/updatehotel")
    public void upateHotel(@RequestBody Hotels hotel) {
        hotelsBookingService.updateHotel(hotel);

    }

    @PostMapping("/saveUser")
    public void saveUser(@RequestBody Users user) {
        hotelsBookingService.saveUser(user);
    }
    
    @PutMapping("/updateUser")
    public void updateUser(@RequestBody Users user) {
        hotelsBookingService.updateUser(user);
    }

    @PostMapping("/addreviewforhotel")
    public void addReviewForHotel(@RequestBody Reviews reviews) {
        hotelsBookingService.addReviewForHotel(reviews);
    }

    @DeleteMapping("/deletehotel/{hotelId}")
    public void deleteHotel(@PathVariable("hotelId") int hotelId) {
        hotelsBookingService.deleteHotel(hotelId);
    }

    @DeleteMapping("/deleteuser/{userId}")
    public void deleteUser(@PathVariable("userId") int userId) {
        hotelsBookingService.deleteUser(userId);
    }

    
    
}
