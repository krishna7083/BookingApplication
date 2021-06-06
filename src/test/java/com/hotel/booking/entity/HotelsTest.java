package com.hotel.booking.entity;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class) 
public class HotelsTest {

    @InjectMocks
    private Hotels hotel;

    @Test
    public void testAllAttribute() {
        hotel.setAirConditionary(true);
        hotel.setCity("city");
        hotel.setCostOfStay(300);
        hotel.setHotelId(1);
        hotel.setMealsIncluded(true);
        hotel.setNoOfRooms(5);
        hotel.setNoOfStars(5);
        hotel.setWifiAvailability(true);
        assertEquals(true, hotel.isAirConditionary());
        assertEquals(true, hotel.isMealsIncluded());
        assertEquals(true,hotel.isWifiAvailability());
        assertEquals("city", hotel.getCity());
        assertEquals(300, hotel.getCostOfStay());
        assertEquals(1, hotel.getHotelId());
        assertEquals(5, hotel.getNoOfRooms());
        assertEquals(5, hotel.getNoOfStars());
    }
    
}
