package com.geektrust.backend.entities;

public abstract class Subscription {
    protected Integer validityInMonths;
    protected Integer price;
    public Integer getValidityInMonths() {
        return validityInMonths;
    }
    public Integer getPrice() {
        return price;
    }
}
