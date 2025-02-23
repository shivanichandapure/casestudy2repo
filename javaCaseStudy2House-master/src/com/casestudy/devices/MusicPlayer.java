package com.casestudy.devices;

import com.casestudy.interfaces.BedroomDevice;
import com.casestudy.interfaces.EntertainmentDevice;
import com.casestudy.interfaces.LivingRoomDevice;

public class MusicPlayer extends Device implements EntertainmentDevice, BedroomDevice,
        LivingRoomDevice {


    public MusicPlayer() {
    }

    public MusicPlayer(int deviceId, String deviceName) {
        super(deviceId, deviceName);
    }
}
