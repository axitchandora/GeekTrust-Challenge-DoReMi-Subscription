package com.geektrust.backend.entities.factory;

import com.geektrust.backend.entities.Subscription;
import com.geektrust.backend.enums.SubscriptionCategory;
import com.geektrust.backend.enums.SubscriptionPlan;
import com.geektrust.backend.exceptions.SubscriptionInvalidTypeException;

public class SubscriptionFactoryProducer {
    private static AbstractFactory getSubscriptionCategoryFactory(SubscriptionCategory subscriptionCategoryType){
        switch (subscriptionCategoryType){
            case MUSIC:return new MusicSubscriptionFactory();
            case VIDEO:return new VideoSubscriptionFactory();
            case PODCAST:return new PodCastSubscriptionFactory();
        }
        return null;
    }
    public static Subscription getSubscription(SubscriptionCategory subscriptionCategoryType, SubscriptionPlan subscriptionPlanType){
        AbstractFactory abstractFactory=SubscriptionFactoryProducer.getSubscriptionCategoryFactory(subscriptionCategoryType);
        if(abstractFactory==null) throw new SubscriptionInvalidTypeException("SubscriptionCategory is Invalid!");
        Subscription subscription=abstractFactory.getSubscriptionPlan(subscriptionPlanType);
        if(subscription==null) throw new SubscriptionInvalidTypeException("SubscriptionPlan is Invalid!");
        return subscription;
    }
}
