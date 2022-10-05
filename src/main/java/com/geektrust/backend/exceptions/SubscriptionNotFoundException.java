package com.geektrust.backend.exceptions;

public class SubscriptionNotFoundException extends RuntimeException{
    public  SubscriptionNotFoundException(String msg){
        super(msg);
    }
}
