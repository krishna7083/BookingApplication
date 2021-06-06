package com.hotel.booking.entity;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class) 
public class BookingTest {

    @InjectMocks
    private Booking booking;

    @Test
    public void testBookingId() {
        booking.setBookingId(1);
        assertEquals(1, booking.getBookingId());
    }

    @Test
    public void testHotelId() {
        booking.setHotelId(1);
        assertEquals(1, booking.getHotelId());
    }

    @Test
    public void testUserId() {
        booking.setUserId(1);
        assertEquals(1, booking.getUserId());
    }
    
    @Test
    public void testRoomId() {
        booking.setRoomId(1);
        assertEquals(1, booking.getRoomId());
    }
    
    
    
}
