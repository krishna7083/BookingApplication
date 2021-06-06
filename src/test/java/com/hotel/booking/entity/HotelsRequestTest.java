package com.hotel.booking.entity;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class) 
public class HotelsRequestTest {

    @InjectMocks
    private HotelsRequest hotelsRequest;

    @Test
    public void testAllAttributed() {
        hotelsRequest.setAirConditionary(true);
        hotelsRequest.setCity("city");
        hotelsRequest.setMealsIncluded(true);
        hotelsRequest.setNoOfRoomsRequired(2);
        hotelsRequest.setNoOfStars(5);
        hotelsRequest.setWifiAvailability(true);
        assertEquals(5,hotelsRequest.getNoOfStars());
        assertEquals(true, hotelsRequest.isAirConditionary());
        assertEquals("city",hotelsRequest.getCity());
        assertEquals(true, hotelsRequest.isMealsIncluded());
        assertEquals(true, hotelsRequest.isWifiAvailability());
        assertEquals(2, hotelsRequest.getNoOfRoomsRequired());
    }
    
}
