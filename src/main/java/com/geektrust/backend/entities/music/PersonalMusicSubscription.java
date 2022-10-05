package com.geektrust.backend.entities.music;

import com.geektrust.backend.constants.Constants;
import com.geektrust.backend.entities.Subscription;

public class PersonalMusicSubscription extends Subscription {
    public PersonalMusicSubscription(){
        super.price = Constants.MUSIC_SUBSCRIPTION_PERSONAL_PLAN_PRICE;
        super.validityInMonths= Constants.MUSIC_SUBSCRIPTION_PERSONAL_PLAN_VALIDITY;
    }
}
