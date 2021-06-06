package com.hotel.booking.service;

import java.util.ArrayList;

/**
 * This is the Implementation of the Service Interface where the main logic is 
 * present for acccessing the data.
 * @author Krushna Oza
 */

import java.util.List;
import java.util.stream.Collectors;

import com.hotel.booking.entity.Hotels;
import com.hotel.booking.entity.HotelsRequest;
import com.hotel.booking.entity.ReviewAndCommentResponse;
import com.hotel.booking.entity.Reviews;
import com.hotel.booking.entity.Users;
import com.hotel.booking.repository.BookingRepository;
import com.hotel.booking.repository.HotelsRepository;
import com.hotel.booking.repository.ReviewsRepository;
import com.hotel.booking.repository.RoomsRepository;
import com.hotel.booking.repository.UsersRepository;

import org.springframework.beans.factory.annotation.Autowired;

public class HotelsBookingServiceImpl implements HotelsBookingService {

    @Autowired
    HotelsRepository hotelsRepository;

    @Autowired
    BookingRepository bookingRepository;

    @Autowired
    ReviewsRepository reviewsRepository;

    @Autowired
    RoomsRepository roomsRepository;

    @Autowired
    UsersRepository usersRepository;

    /**
     * This method take the hotelRequest as a parameter, get the data from database,
     * apply filter on it, and return the filtered data
     * @author Krushna Oza
    */

    @Override
    public List<Hotels> getRequestedHotels(HotelsRequest hotelRequest) {

        List<Hotels> listOfAllHotels = (List<Hotels>) hotelsRepository.findAll();
        List<Hotels> filteredListOfAllHotels;

        // applying filtering to filter out the data as per user request..
        filteredListOfAllHotels = listOfAllHotels.stream().filter(hotels
        -> hotels.getCity().equalsIgnoreCase(hotelRequest.getCity()))
        .filter(hotels -> hotels.getNoOfStars().equals(hotelRequest.getNoOfStars())).
         filter(hotels -> hotels.isWifiAvailability()== hotelRequest.isWifiAvailability())
        .filter(hotels-> hotels.isAirConditionary() == hotelRequest.isAirConditionary())
        .filter(hotels-> hotels.isMealsIncluded() == hotelRequest.isMealsIncluded())
        .collect(Collectors.toList());

        return filteredListOfAllHotels;
    }

    /**
     * This method take the hotel id in order to get the reviews and comments of
     * the requested hotel.
     * @author Krushna Oza
     */
    @Override
    public List<ReviewAndCommentResponse> getReviewAndCommentOfHotels(int hotelId) {
        
        List<Reviews> listOfAllHotelsReviews = (List<Reviews>) reviewsRepository.findAll();

        List<ReviewAndCommentResponse> listOfResultResponse = new ArrayList<>();

        for(Reviews review: listOfAllHotelsReviews) {
            if(review.getHotelId().equals(hotelId)) {
                ReviewAndCommentResponse reviewAndCommentResponse = new ReviewAndCommentResponse();
                reviewAndCommentResponse.setComments(review.getComment());
                reviewAndCommentResponse.setRating(review.getRating());
                listOfResultResponse.add(reviewAndCommentResponse);
            }

        }
        return listOfResultResponse;
    }

    @Override
    public void saveHotel(Hotels hotel) {
        hotelsRepository.save(hotel);
    }

    @Override
    public void updateHotel(Hotels hotel) {
        hotelsRepository.save(hotel);
    }

    @Override
    public void saveUser(Users user) {
        usersRepository.save(user);
    }

    @Override
    public void updateUser(Users user) {
        usersRepository.save(user);
    }

    @Override
    public void addReviewForHotel(Reviews reviews) {
        reviewsRepository.save(reviews);

    }

    @Override
    public void deleteHotel(int hotelId) {
        hotelsRepository.deleteById(hotelId);
    }

    @Override
    public void deleteUser(int userId) {
        usersRepository.deleteById(userId);
    }


    
}
