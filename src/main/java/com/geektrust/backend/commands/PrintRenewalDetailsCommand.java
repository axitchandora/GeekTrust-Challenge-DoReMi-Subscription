package com.geektrust.backend.commands;

import com.geektrust.backend.dto.RenewalAmountDto;
import com.geektrust.backend.dto.RenewalReminderDto;
import com.geektrust.backend.exceptions.SubscriptionNotFoundException;
import com.geektrust.backend.services.IRenewalService;

import java.util.List;

public class PrintRenewalDetailsCommand implements ICommand{

    private final IRenewalService renewalService;

    public PrintRenewalDetailsCommand(IRenewalService renewalService) {
        this.renewalService = renewalService;
    }

    @Override
    public void execute(List<String> tokens) {
        try {
            List<RenewalReminderDto> renewalReminderDtoList=renewalService.calculateListOfRenewalDateOfSubscriptions();
            RenewalAmountDto renewalAmountDto=renewalService.calculateRenewalAmount();
            renewalReminderDtoList.forEach(rRemDto -> System.out.println(rRemDto.toString()));
            System.out.println(renewalAmountDto);
        } catch (SubscriptionNotFoundException e) {
            System.out.println(e.getMessage());
        } catch (Exception e){
            System.out.println(e.toString());
        }
    }
}
