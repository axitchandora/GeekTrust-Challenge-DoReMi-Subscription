package com.geektrust.backend.dto;

import com.geektrust.backend.constants.Constants;
import com.geektrust.backend.enums.SubscriptionCategory;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class RenewalReminderDto {
    private final SubscriptionCategory subscriptionCategory;
    private final LocalDate renewalDate;

    public RenewalReminderDto(LocalDate renewalDate, SubscriptionCategory subscriptionCategory) {
        this.renewalDate = renewalDate;
        this.subscriptionCategory = subscriptionCategory;
    }

    @Override
    public String toString() {
        return "RENEWAL_REMINDER " +
                subscriptionCategory +
                " " + DateTimeFormatter.ofPattern(Constants.DATE_FORMAT).format(renewalDate);
    }
}
