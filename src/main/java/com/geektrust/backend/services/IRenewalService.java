package com.geektrust.backend.services;

import com.geektrust.backend.dto.RenewalAmountDto;
import com.geektrust.backend.dto.RenewalReminderDto;
import com.geektrust.backend.exceptions.SubscriptionNotFoundException;

import java.util.List;

public interface IRenewalService {
    List<RenewalReminderDto> calculateListOfRenewalDateOfSubscriptions() throws SubscriptionNotFoundException;
    RenewalAmountDto calculateRenewalAmount();
}
