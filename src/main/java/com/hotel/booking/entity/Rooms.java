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
 * This is the pojo class for Entity Rooms
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "Rooms")
public class Rooms {

    @Id
	@GeneratedValue(strategy = IDENTITY)
    private Integer roomId;

    private Integer hotelId;
    private String roomDescription;

}
