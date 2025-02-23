package com.casestudy.devices;

import com.casestudy.interfaces.WashroomDevice;

public class Geyser extends Device implements WashroomDevice {

    public Geyser() {
    }

    public Geyser(int deviceId, String deviceName) {
        super(deviceId, deviceName);
    }
}
