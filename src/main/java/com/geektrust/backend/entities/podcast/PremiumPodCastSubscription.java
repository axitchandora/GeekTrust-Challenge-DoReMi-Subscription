package com.geektrust.backend.entities.podcast;

import com.geektrust.backend.constants.Constants;
import com.geektrust.backend.entities.Subscription;

public class PremiumPodCastSubscription extends Subscription {
    public PremiumPodCastSubscription(){
        super.price = Constants.PODCAST_SUBSCRIPTION_PREMIUM_PLAN_PRICE;
        super.validityInMonths= Constants.PODCAST_SUBSCRIPTION_PREMIUM_PLAN_VALIDITY;
    }
}
