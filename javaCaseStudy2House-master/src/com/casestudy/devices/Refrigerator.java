package com.casestudy.devices;

import com.casestudy.interfaces.KitchenDevice;

public class Refrigerator extends Device implements KitchenDevice {
    public Refrigerator(int id,String roomName, boolean status) {
        super(id, "Refrigerator",roomName, status);
    }

    @Override
    public void addDevice() {

    }
}
