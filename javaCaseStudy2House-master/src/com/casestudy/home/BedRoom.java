package com.casestudy.home;

import com.casestudy.devices.Device;
import com.casestudy.interfaces.BedroomDevice;

public class BedRoom extends Room {

    private int id;
    private String deviceName;
    private boolean status;

   public BedRoom() {
        this.setName("Bedroom");
    }

    public BedRoom(int id, String deviceName,boolean status) {
        this.id = id;
        this.deviceName = deviceName;
        this.status=status;
    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDeviceName() {
        return deviceName;
    }

    public void setDeviceName(String deviceName) {
        this.deviceName = deviceName;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
}
