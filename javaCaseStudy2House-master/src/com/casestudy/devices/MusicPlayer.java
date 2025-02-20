package com.casestudy.devices;

import com.casestudy.interfaces.BedroomDevice;
import com.casestudy.interfaces.EntertainmentDevice;

public class MusicPlayer extends Device implements EntertainmentDevice, BedroomDevice {
    public MusicPlayer(int id,String roomName, boolean status) {
        super(id, "MusicPlayer",roomName, status);
    }

    @Override
    public void addDevice() {

    }
}
