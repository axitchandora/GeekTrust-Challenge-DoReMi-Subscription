package com.geektrust.backend.services;

import com.geektrust.backend.constants.Constants;
import com.geektrust.backend.entities.Device;
import com.geektrust.backend.entities.Subscription;
import com.geektrust.backend.entities.DoReMiSubscription;
import com.geektrust.backend.entities.factory.DeviceFactory;
import com.geektrust.backend.entities.factory.SubscriptionFactoryProducer;
import com.geektrust.backend.enums.*;
import com.geektrust.backend.exceptions.AddSubscriptionFailedException;
import com.geektrust.backend.exceptions.AddTopUpFailedException;
import com.geektrust.backend.exceptions.InvalidDateException;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

public class SubscriptionService implements ISubscriptionService{
    private final DoReMiSubscription doReMiSubscription;
    private final DateTimeFormatter dateFormatter;

    public SubscriptionService(DoReMiSubscription doReMiSubscription) {
        this.doReMiSubscription = doReMiSubscription;
        this.dateFormatter=DateTimeFormatter.ofPattern(Constants.DATE_FORMAT);
    }

    private boolean isAValidStringDate(String dateStr){
        try {
            LocalDate.parse(dateStr, dateFormatter);
        } catch (DateTimeParseException e) {
            return false;
        }
        return true;
    }
    @Override
    public void startSubscriptionForUser(String dateStr) throws InvalidDateException {
        if(!isAValidStringDate(dateStr)) throw new InvalidDateException("INVALID_DATE");
        LocalDate startingDate=LocalDate.parse(dateStr,dateFormatter);
        doReMiSubscription.addDateOfSubscription(startingDate);
    }

    @Override
    public void addSubscriptionForUser(SubscriptionCategory subscriptionCategory, SubscriptionPlan subscriptionPlan)throws AddSubscriptionFailedException{
        if(doReMiSubscription.getSubscriptionStatus().equals(SubscriptionStatus.NOT_STARTED)) throw new AddSubscriptionFailedException("ADD_SUBSCRIPTION_FAILED INVALID_DATE");
        if(doReMiSubscription.isSubscriptionCategoryExistInCurrentPlan(subscriptionCategory)) throw new AddSubscriptionFailedException("ADD_SUBSCRIPTION_FAILED DUPLICATE_CATEGORY");
        Subscription subscription= SubscriptionFactoryProducer.getSubscription(subscriptionCategory,subscriptionPlan);
        doReMiSubscription.addSubscriptionToCurrentPlan(subscriptionCategory,subscription);
    }

    @Override
    public void addTopUpForUser(DeviceType deviceType, Integer noOfMonths)throws AddTopUpFailedException {
        if(doReMiSubscription.getSubscriptionStatus().equals(SubscriptionStatus.NOT_STARTED)) throw new AddTopUpFailedException("ADD_TOPUP_FAILED INVALID_DATE");
        if(doReMiSubscription.getSubscriptionStatus().equals(SubscriptionStatus.STARTED))throw new AddTopUpFailedException("ADD_TOPUP_FAILED SUBSCRIPTIONS_NOT_FOUND");
        if(doReMiSubscription.getTopUpStatus().equals(TopUpStatus.ADDED)) throw new AddTopUpFailedException("ADD_TOPUP_FAILED DUPLICATE_TOPUP");
        Device device= DeviceFactory.getDevice(deviceType);
        doReMiSubscription.addAdditionalDevices(device,noOfMonths);
    }
}
