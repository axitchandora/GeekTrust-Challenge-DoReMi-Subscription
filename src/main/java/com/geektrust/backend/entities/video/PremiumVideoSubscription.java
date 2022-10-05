package com.geektrust.backend.entities.video;

import com.geektrust.backend.constants.Constants;
import com.geektrust.backend.entities.Subscription;

public class PremiumVideoSubscription extends Subscription {
    public PremiumVideoSubscription(){
        super.price = Constants.VIDEO_SUBSCRIPTION_PREMIUM_PLAN_PRICE;
        super.validityInMonths= Constants.VIDEO_SUBSCRIPTION_PREMIUM_PLAN_VALIDITY;
    }
}
