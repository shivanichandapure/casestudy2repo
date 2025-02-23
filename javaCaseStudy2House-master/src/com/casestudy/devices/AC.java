package com.casestudy.devices;

import com.casestudy.interfaces.BedroomDevice;
import com.casestudy.interfaces.LivingRoomDevice;

public class AC extends Device implements BedroomDevice, LivingRoomDevice {

    public AC() {
    }

    public AC(int deviceId, String deviceName) {
        super(deviceId, deviceName);
    }
}
