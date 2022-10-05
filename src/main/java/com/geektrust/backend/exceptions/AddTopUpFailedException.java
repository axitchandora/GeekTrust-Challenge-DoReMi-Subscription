package com.geektrust.backend.exceptions;

public class AddTopUpFailedException extends RuntimeException{
    public AddTopUpFailedException(String msg){
        super(msg);
    }

}
