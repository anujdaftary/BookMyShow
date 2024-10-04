package com.springboot.bookmyshow.Exceptions;

public class ShowSeatNotAvailableException extends RuntimeException{
    public ShowSeatNotAvailableException(String message){
        super(message);
    }
}
