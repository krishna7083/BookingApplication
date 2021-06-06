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
 * This is the pojo class for Entity Booking
 */


@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "Booking")
public class Booking {

    @Id
	@GeneratedValue(strategy = IDENTITY)
    private Integer bookingId;

    private Integer hotelId;
    private Integer roomId;
    private Integer userId;
    
}
