package com.casestudy.devices;

import com.casestudy.interfaces.*;

public class Light extends Device implements BedroomDevice, KitchenDevice, WashroomDevice,
        LivingRoomDevice, CorridorDevice {
    public Light(int id,String roomName, boolean status) {
        super(id, "Light",roomName, status);
    }

    @Override
    public void addDevice() {

    }


}
