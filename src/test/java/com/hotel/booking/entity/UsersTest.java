package com.hotel.booking.entity;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)                         
public class UsersTest {

    @InjectMocks
    Users user;

    @Test
    public void testUserId() {
        user.setUserId(1);
        assertEquals(1, user.getUserId());
    }

    @Test
    public void testUserFirstName() {
        user.setFirstname("firstname");
        assertEquals("firstname",user.getFirstname());
    }

    @Test
    public void testUserLastName() {
        user.setLastname("lastname");
        assertEquals("lastname", user.getLastname());
    }    
    
    @Test
    public void testUserCity() {
        user.setCity("city");
        assertEquals("city", user.getCity());
    }

    @Test
    public void testUserGender() {
        user.setGender("gender");
        assertEquals("gender", user.getGender());
    }
}
