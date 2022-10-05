package com.geektrust.backend.config;

import com.geektrust.backend.commands.*;
import com.geektrust.backend.entities.DoReMiSubscription;
import com.geektrust.backend.services.IRenewalService;
import com.geektrust.backend.services.ISubscriptionService;
import com.geektrust.backend.services.RenewalService;
import com.geektrust.backend.services.SubscriptionService;

public class ApplicationConfig {
    private final DoReMiSubscription doReMiSubscription =new DoReMiSubscription();
    private final ISubscriptionService subscriptionService=new SubscriptionService(doReMiSubscription);
    private final IRenewalService renewalService=new RenewalService(doReMiSubscription);
    private final StartSubscriptionCommand startSubscriptionCommand=new StartSubscriptionCommand(subscriptionService);
    private final AddSubscriptionCommand addSubscriptionCommand=new AddSubscriptionCommand(subscriptionService);
    private final AddTopUpCommand addTopUpCommand=new AddTopUpCommand(subscriptionService);
    private final PrintRenewalDetailsCommand printRenewalDetailsCommand=new PrintRenewalDetailsCommand(renewalService);
    private final CommandInvoker commandInvoker = new CommandInvoker();

    public CommandInvoker getCommandInvoker(){
        commandInvoker.register("START_SUBSCRIPTION",startSubscriptionCommand);
        commandInvoker.register("ADD_SUBSCRIPTION",addSubscriptionCommand);
        commandInvoker.register("ADD_TOPUP",addTopUpCommand);
        commandInvoker.register("PRINT_RENEWAL_DETAILS",printRenewalDetailsCommand);
        return commandInvoker;
    }
}
