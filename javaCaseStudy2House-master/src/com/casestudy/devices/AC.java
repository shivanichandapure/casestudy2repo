package com.casestudy.devices;

import com.casestudy.interfaces.BedroomDevice;
import com.casestudy.interfaces.LivingRoomDevice;

public class AC extends Device implements BedroomDevice, LivingRoomDevice {

    public AC(int id,String roomName, boolean status) {
        super(id, "AC",roomName, status);
    }
    @Override
    public void addDevice() {

        System.out.println("interface added");
    }
}
