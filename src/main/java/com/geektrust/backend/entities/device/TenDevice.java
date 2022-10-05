package com.geektrust.backend.entities.device;

import com.geektrust.backend.constants.Constants;
import com.geektrust.backend.entities.Device;

public class TenDevice extends Device {
    public TenDevice(){
        super.price= Constants.TEN_DEVICE_TOP_UP_PLAN_PRICE_PER_MONTH;
    }
}
