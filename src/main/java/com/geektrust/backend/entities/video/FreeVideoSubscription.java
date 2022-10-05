package com.geektrust.backend.entities.video;

import com.geektrust.backend.constants.Constants;
import com.geektrust.backend.entities.Subscription;

public class FreeVideoSubscription extends Subscription {
    public FreeVideoSubscription(){
        super.price = Constants.VIDEO_SUBSCRIPTION_FREE_PLAN_PRICE;
        super.validityInMonths= Constants.VIDEO_SUBSCRIPTION_FREE_PLAN_VALIDITY;
    }
}
