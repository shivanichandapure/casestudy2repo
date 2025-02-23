package com.casestudy.devices;
import com.casestudy.interfaces.KitchenDevice;

public class Refrigerator extends Device implements KitchenDevice {
    public Refrigerator() {
    }
    public Refrigerator(int deviceId, String deviceName) {
        super(deviceId, deviceName);
    }
}
