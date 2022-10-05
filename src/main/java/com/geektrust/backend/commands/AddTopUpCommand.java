package com.geektrust.backend.commands;

import com.geektrust.backend.constants.Constants;
import com.geektrust.backend.enums.DeviceType;
import com.geektrust.backend.exceptions.AddTopUpFailedException;
import com.geektrust.backend.services.ISubscriptionService;

import java.util.List;

public class AddTopUpCommand implements ICommand{

    private final ISubscriptionService subscriptionService;

    public AddTopUpCommand(ISubscriptionService subscriptionService) {
        this.subscriptionService = subscriptionService;
    }

    @Override
    public void execute(List<String> tokens) {
        try {
            DeviceType deviceType = DeviceType.valueOf(tokens.get(Constants.ONE));
            Integer noOfMonths=Integer.parseInt(tokens.get(Constants.TWO));
            subscriptionService.addTopUpForUser(deviceType,noOfMonths);
        } catch (AddTopUpFailedException e) {
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println(e.toString());
        }
    }
}
