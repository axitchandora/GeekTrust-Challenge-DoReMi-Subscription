package com.geektrust.backend.exceptions;

public class AddSubscriptionFailedException extends RuntimeException{
    public AddSubscriptionFailedException(String msg){
        super(msg);
    }
}
