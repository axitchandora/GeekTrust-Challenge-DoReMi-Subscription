package com.geektrust.backend.exceptions;

public class SubscriptionInvalidTypeException extends RuntimeException{
    public SubscriptionInvalidTypeException(String msgStr){
        super(msgStr);
    }
}
