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
 * This is the pojo class for Entity Reviews
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "Reviews")
public class Reviews {

    @Id
	@GeneratedValue(strategy = IDENTITY)
    private Integer reviewId;

    private Integer hotelId;
    private Integer userId;
    private String comment;
    private Integer rating;   // rating out of 10
    
}
