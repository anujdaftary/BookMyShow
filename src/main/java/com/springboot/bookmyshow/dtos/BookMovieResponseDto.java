package com.springboot.bookmyshow.dtos;

import com.springboot.bookmyshow.models.BookingResponseStatus;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class BookMovieResponseDto {
    private long BookingId;
    private BookingResponseStatus bookingResponseStatus;
    private double amount;
}
