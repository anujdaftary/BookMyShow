package com.springboot.bookmyshow.Controllers;

import com.springboot.bookmyshow.Services.BookingService;
import com.springboot.bookmyshow.dtos.BookMovieRequestDto;
import com.springboot.bookmyshow.dtos.BookMovieResponseDto;
import com.springboot.bookmyshow.models.Booking;
import com.springboot.bookmyshow.models.BookingResponseStatus;

public class BookingController {
    private BookingService bookingService;

    public BookingController(BookingService bookingService) {
        this.bookingService = bookingService;
    }

    public BookMovieResponseDto bookMovie(BookMovieRequestDto bookMovieRequestDto) {
        BookMovieResponseDto bookMovieResponseDto = new BookMovieResponseDto();

        try {
            Booking booking = bookingService.bookMovie(bookMovieRequestDto.getUserId(),
                    bookMovieRequestDto.getShowId(),
                    bookMovieRequestDto.getShowSeatIds());

            bookMovieResponseDto.setBookingResponseStatus(BookingResponseStatus.SUCCESS);
            bookMovieResponseDto.setAmount(booking.getAmount());
            bookMovieResponseDto.setBookingId(booking.getId());
        } catch (Exception exception) {
            bookMovieResponseDto.setBookingResponseStatus(BookingResponseStatus.FAILURE);
        }

        return bookMovieResponseDto;
    }

    }
