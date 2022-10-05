package com.geektrust.backend.services;

import com.geektrust.backend.enums.SubscriptionCategory;
import com.geektrust.backend.enums.SubscriptionPlan;
import com.geektrust.backend.enums.DeviceType;
import com.geektrust.backend.exceptions.AddSubscriptionFailedException;
import com.geektrust.backend.exceptions.AddTopUpFailedException;
import com.geektrust.backend.exceptions.InvalidDateException;

public interface ISubscriptionService {
    void startSubscriptionForUser(String dateStr) throws InvalidDateException;
    void addSubscriptionForUser(SubscriptionCategory subscriptionCategory, SubscriptionPlan subscriptionPlan)throws AddSubscriptionFailedException;
    void addTopUpForUser(DeviceType deviceType, Integer noOfDays)throws AddTopUpFailedException;
}
