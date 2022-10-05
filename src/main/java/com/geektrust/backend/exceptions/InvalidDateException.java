package com.geektrust.backend.exceptions;

public class InvalidDateException extends RuntimeException{
    public InvalidDateException(String msg){
        super(msg);
    }
}
