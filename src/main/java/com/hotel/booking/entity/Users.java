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
 * This is the pojo class for Entity Users
 */


@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "Users")
public class Users {

    @Id
	@GeneratedValue(strategy = IDENTITY)
    private Integer userId;

    private String firstname;
    private String lastname;
    private String gender;
    private String city;
    
}
