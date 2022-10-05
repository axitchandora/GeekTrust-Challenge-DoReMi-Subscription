package com.geektrust.backend.commands;

import com.geektrust.backend.constants.Constants;
import com.geektrust.backend.enums.SubscriptionCategory;
import com.geektrust.backend.enums.SubscriptionPlan;
import com.geektrust.backend.exceptions.AddSubscriptionFailedException;
import com.geektrust.backend.services.ISubscriptionService;

import java.util.List;

public class AddSubscriptionCommand implements ICommand{
    private final ISubscriptionService subscriptionService;

    public AddSubscriptionCommand(ISubscriptionService subscriptionService) {
        this.subscriptionService = subscriptionService;
    }

    @Override
    public void execute(List<String> tokens) {
        try {
            SubscriptionCategory subscriptionCategory=SubscriptionCategory.valueOf(tokens.get(Constants.ONE));
            SubscriptionPlan subscriptionPlan=SubscriptionPlan.valueOf(tokens.get(Constants.TWO));
            subscriptionService.addSubscriptionForUser(subscriptionCategory,subscriptionPlan);
        } catch (AddSubscriptionFailedException e) {
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println(e.toString());
        }
    }
}
