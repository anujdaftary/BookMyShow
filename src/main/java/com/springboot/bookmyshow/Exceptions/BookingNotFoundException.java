package com.springboot.bookmyshow.Exceptions;

public class BookingNotFoundException extends RuntimeException{
   public BookingNotFoundException(String message){
        super(message);
    }
}
