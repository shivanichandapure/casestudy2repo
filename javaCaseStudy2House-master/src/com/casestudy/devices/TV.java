package com.casestudy.devices;

import com.casestudy.interfaces.BedroomDevice;
import com.casestudy.interfaces.EntertainmentDevice;

public class TV extends Device implements EntertainmentDevice, BedroomDevice {
    public TV(int id,String roomName, boolean status) {
        super(id, "TV",roomName, status);
    }

    @Override
    public void addDevice() {

    }
}
