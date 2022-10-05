package com.geektrust.backend.entities.factory;

import com.geektrust.backend.entities.Subscription;
import com.geektrust.backend.entities.podcast.FreePodCastSubscription;
import com.geektrust.backend.entities.podcast.PersonalPodCastSubscription;
import com.geektrust.backend.entities.podcast.PremiumPodCastSubscription;
import com.geektrust.backend.enums.SubscriptionPlan;

public class PodCastSubscriptionFactory extends AbstractFactory{
    @Override
    Subscription getSubscriptionPlan(SubscriptionPlan subscriptionPlanType) {
        switch (subscriptionPlanType){
            case FREE:return new FreePodCastSubscription();
            case PERSONAL:return new PersonalPodCastSubscription();
            case PREMIUM:return new PremiumPodCastSubscription();
        }
        return null;
    }
}
