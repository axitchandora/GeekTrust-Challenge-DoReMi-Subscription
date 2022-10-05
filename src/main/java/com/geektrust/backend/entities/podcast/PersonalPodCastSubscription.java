package com.geektrust.backend.entities.podcast;

import com.geektrust.backend.constants.Constants;
import com.geektrust.backend.entities.Subscription;

public class PersonalPodCastSubscription extends Subscription {
    public PersonalPodCastSubscription(){
        super.price = Constants.PODCAST_SUBSCRIPTION_PERSONAL_PLAN_PRICE;
        super.validityInMonths= Constants.PODCAST_SUBSCRIPTION_PERSONAL_PLAN_VALIDITY;
    }
}
