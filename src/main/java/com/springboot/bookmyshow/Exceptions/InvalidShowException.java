package com.springboot.bookmyshow.Exceptions;

public class InvalidShowException extends RuntimeException{
    public InvalidShowException(String message){
        super(message);
    }
}
