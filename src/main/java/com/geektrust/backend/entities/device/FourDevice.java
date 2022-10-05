package com.geektrust.backend.entities.device;

import com.geektrust.backend.constants.Constants;
import com.geektrust.backend.entities.Device;

public class FourDevice extends Device {
    public FourDevice(){
        super.price= Constants.FOUR_DEVICE_TOP_UP_PLAN_PRICE_PER_MONTH;
    }
}
