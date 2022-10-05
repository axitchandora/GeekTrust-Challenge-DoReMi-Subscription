package com.geektrust.backend.entities.factory;

import com.geektrust.backend.entities.Subscription;
import com.geektrust.backend.enums.SubscriptionPlan;

public abstract class AbstractFactory {
    abstract Subscription getSubscriptionPlan(SubscriptionPlan subscriptionPlanType);
}
