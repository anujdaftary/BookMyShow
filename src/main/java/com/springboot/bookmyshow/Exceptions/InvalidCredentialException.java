package com.springboot.bookmyshow.Exceptions;

public class InvalidCredentialException extends RuntimeException{
    public InvalidCredentialException(String message){

        super(message);
    }
}
