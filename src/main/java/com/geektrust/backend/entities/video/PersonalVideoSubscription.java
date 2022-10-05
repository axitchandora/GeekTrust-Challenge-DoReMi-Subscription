package com.geektrust.backend.entities.video;

import com.geektrust.backend.constants.Constants;
import com.geektrust.backend.entities.Subscription;

public class PersonalVideoSubscription extends Subscription {
    public PersonalVideoSubscription(){
        super.price = Constants.VIDEO_SUBSCRIPTION_PERSONAL_PLAN_PRICE;
        super.validityInMonths= Constants.VIDEO_SUBSCRIPTION_PERSONAL_PLAN_VALIDITY;
    }
}
