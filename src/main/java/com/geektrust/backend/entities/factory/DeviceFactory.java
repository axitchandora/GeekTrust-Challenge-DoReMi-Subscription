package com.geektrust.backend.entities.factory;

import com.geektrust.backend.entities.Device;
import com.geektrust.backend.entities.device.FourDevice;
import com.geektrust.backend.entities.device.TenDevice;
import com.geektrust.backend.enums.DeviceType;

public class DeviceFactory {
    public static Device getDevice(DeviceType deviceType){
        switch (deviceType){
            case FOUR_DEVICE:return new FourDevice();
            case TEN_DEVICE:return new TenDevice();
        }
        return null;
    }
}
