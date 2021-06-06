package com.hotel.booking.entity;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class) 
public class ReviewAndCommentResponseTest {

    @InjectMocks
    private ReviewAndCommentResponse reviewAndCommentResponse;

    @Test
    public void testAllAttributes() {
        reviewAndCommentResponse.setComments("comments");
        reviewAndCommentResponse.setRating(5);
        assertEquals("comments", reviewAndCommentResponse.getComments());
        assertEquals(5, reviewAndCommentResponse.getRating());
    }
    
}
