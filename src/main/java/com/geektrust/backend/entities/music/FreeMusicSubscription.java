package com.geektrust.backend.entities.music;

import com.geektrust.backend.constants.Constants;
import com.geektrust.backend.entities.Subscription;

public class FreeMusicSubscription extends Subscription {
    public FreeMusicSubscription(){
        super.price = Constants.MUSIC_SUBSCRIPTION_FREE_PLAN_PRICE;
        super.validityInMonths= Constants.MUSIC_SUBSCRIPTION_FREE_PLAN_VALIDITY;
    }
}
