package com.hotel.booking.entity;
/**
 * This is the pojo class in order to build a response object required for
 * review and comment end point request.
 * @author Krushna Oza
 */
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ReviewAndCommentResponse {
    
    private Integer rating;
    private String  comments;
}
