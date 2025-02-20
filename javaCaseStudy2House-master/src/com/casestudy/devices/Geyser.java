package com.casestudy.devices;

import com.casestudy.interfaces.WashroomDevice;

public class Geyser extends Device implements WashroomDevice {
    public Geyser(int id,String roomName, boolean status) {
        super(id, "Geyser",roomName, status);
    }


    @Override
    public void addDevice() {

    }
}
