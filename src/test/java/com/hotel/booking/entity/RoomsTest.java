package com.hotel.booking.entity;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class) 
public class RoomsTest {

    @InjectMocks
    private Rooms room;

    @Test
    public void testroomId() {
        room.setRoomId(1);
        assertEquals(1, room.getRoomId());
    }

    @Test
    public void testRoomDescription() {
        room.setRoomDescription("roomDescription");
        assertEquals("roomDescription", room.getRoomDescription());
    }

    @Test
    public void testRoomHotelID(){
        room.setHotelId(1);
        assertEquals(1, room.getHotelId());
    }
    
}
