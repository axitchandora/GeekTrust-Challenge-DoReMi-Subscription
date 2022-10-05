package com.geektrust.backend.entities.factory;

import com.geektrust.backend.entities.Subscription;
import com.geektrust.backend.entities.music.FreeMusicSubscription;
import com.geektrust.backend.entities.music.PersonalMusicSubscription;
import com.geektrust.backend.entities.music.PremiumMusicSubscription;
import com.geektrust.backend.enums.SubscriptionPlan;

public class MusicSubscriptionFactory extends AbstractFactory{
    @Override
    Subscription getSubscriptionPlan(SubscriptionPlan subscriptionPlanType) {
        switch (subscriptionPlanType){
            case FREE:return new FreeMusicSubscription();
            case PERSONAL:return new PersonalMusicSubscription();
            case PREMIUM:return new PremiumMusicSubscription();
        }
        return null;
    }
}
