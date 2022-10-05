package com.geektrust.backend.entities.podcast;

import com.geektrust.backend.constants.Constants;
import com.geektrust.backend.entities.Subscription;

public class FreePodCastSubscription extends Subscription {
    public FreePodCastSubscription(){
        super.price = Constants.PODCAST_SUBSCRIPTION_FREE_PLAN_PRICE;
        super.validityInMonths= Constants.PODCAST_SUBSCRIPTION_FREE_PLAN_VALIDITY;
    }
}
