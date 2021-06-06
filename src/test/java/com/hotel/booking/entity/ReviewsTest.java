package com.hotel.booking.entity;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class) 
public class ReviewsTest {

    @InjectMocks
    private Reviews review;

    @Test
    public void testReviewId() {
        review.setReviewId(1);
        assertEquals(1, review.getReviewId());
    }

    @Test
    public void testReviewUserId() {
        review.setUserId(1);
        assertEquals(1, review.getUserId());
    }

    @Test
    public void testReviewHotelID() {
        review.setHotelId(1);
        assertEquals(1, review.getHotelId());
    }

    @Test
    public void testReviewRatingandComments() {
        review.setRating(5);
        review.setComment("comment");
        assertEquals(5, review.getRating());
        assertEquals("comment", review.getComment());
    }
    
    
}
