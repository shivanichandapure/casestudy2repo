package com.casestudy.devices;

import com.casestudy.interfaces.*;

public class Light extends Device implements BedroomDevice, KitchenDevice, WashroomDevice,
        LivingRoomDevice, CorridorDevice {

    public Light() {
    }

    public Light(int deviceId, String deviceName) {
        super(deviceId, deviceName);
    }
}
