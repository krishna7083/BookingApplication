package com.hotel.booking.service;

import static org.mockito.Mockito.verify;

import com.hotel.booking.entity.Hotels;
import com.hotel.booking.repository.HotelsRepository;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;


@ExtendWith(MockitoExtension.class) 
public class HotelsBookingServiceImplTest {

    @InjectMocks
    private HotelsBookingServiceImpl hotelsBookingServiceImpl;

    @Mock
    HotelsRepository hotelsRepository;

    @Test
    public void testSaveHotel() {

        Hotels hotel = new Hotels();
        hotel.setAirConditionary(true);
        hotelsBookingServiceImpl.saveHotel(hotel);
        verify(hotelsRepository).save(hotel);
    }

    
}
