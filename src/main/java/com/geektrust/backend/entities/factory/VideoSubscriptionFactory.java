package com.geektrust.backend.entities.factory;

import com.geektrust.backend.entities.Subscription;
import com.geektrust.backend.entities.video.FreeVideoSubscription;
import com.geektrust.backend.entities.video.PersonalVideoSubscription;
import com.geektrust.backend.entities.video.PremiumVideoSubscription;
import com.geektrust.backend.enums.SubscriptionPlan;

public class VideoSubscriptionFactory extends AbstractFactory{
    @Override
    Subscription getSubscriptionPlan(SubscriptionPlan subscriptionPlanType) {
        switch (subscriptionPlanType){
            case FREE:return new FreeVideoSubscription();
            case PERSONAL:return new PersonalVideoSubscription();
            case PREMIUM:return new PremiumVideoSubscription();
        }
        return null;
    }
}
