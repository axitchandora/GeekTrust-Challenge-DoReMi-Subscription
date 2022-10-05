package com.geektrust.backend.entities.music;

import com.geektrust.backend.constants.Constants;
import com.geektrust.backend.entities.Subscription;

public class PremiumMusicSubscription extends Subscription {
    public PremiumMusicSubscription(){
        super.price = Constants.MUSIC_SUBSCRIPTION_PREMIUM_PLAN_PRICE;
        super.validityInMonths= Constants.MUSIC_SUBSCRIPTION_PREMIUM_PLAN_VALIDITY;
    }
}
