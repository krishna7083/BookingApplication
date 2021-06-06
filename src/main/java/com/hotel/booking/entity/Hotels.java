package com.hotel.booking.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import static javax.persistence.GenerationType.IDENTITY;

/**
 * This is the pojo class for Entity Hotels
 * @author Krushna Oza
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "Hotels")
public class Hotels {
    
    @Id
	@GeneratedValue(strategy = IDENTITY)
    private Integer hotelId;
    private String city;
    private Integer noOfRooms;
    private Integer noOfStars;
    private boolean wifiAvailability;
    private boolean airConditionary;
    private boolean mealsIncluded;
    private Integer costOfStay;
}
