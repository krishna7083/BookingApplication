package com.hotel.booking.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class HotelsRequest {

    private String  city;
    private Integer noOfRoomsRequired;
    private Integer noOfStars;
    private boolean wifiAvailability;
    private boolean airConditionary;
    private boolean mealsIncluded;
    
}
