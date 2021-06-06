package com.hotel.booking.controller;

import static org.mockito.Mockito.verify;

import com.hotel.booking.entity.HotelsRequest;
import com.hotel.booking.service.HotelsBookingService;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.beans.factory.annotation.Autowired;

@ExtendWith(MockitoExtension.class) 
public class HotelBookingControllerTest {

    @InjectMocks
    HotelBookingController hotelBookingController;

    @Mock
    HotelsBookingService hotelsBookingService;

    @Autowired
    HotelsRequest hotelsRequest;

    @Test
    public void testGetRequestedHotels() {

        hotelsRequest = getHotelRequest();
        Mockito.when(hotelsBookingService.getRequestedHotels(hotelsRequest)).thenReturn(null);
        hotelBookingController.getRequestedHotels(hotelsRequest);
        verify(hotelsBookingService).getRequestedHotels(hotelsRequest);


    }
    
    private HotelsRequest getHotelRequest() {
        HotelsRequest hotelsRequest = new HotelsRequest();
        hotelsRequest.setAirConditionary(true);
        hotelsRequest.setCity("city");
        hotelsRequest.setMealsIncluded(true);
        hotelsRequest.setNoOfStars(5);

        return hotelsRequest;
    }
    
}
