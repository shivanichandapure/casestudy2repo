package com.casestudy.devices;

import com.casestudy.interfaces.BedroomDevice;
import com.casestudy.interfaces.EntertainmentDevice;
import com.casestudy.interfaces.LivingRoomDevice;

public class TV extends Device implements EntertainmentDevice, BedroomDevice, LivingRoomDevice {

    public TV() {
    }

    public TV(int deviceId, String deviceName) {
        super(deviceId, deviceName);
    }
}
