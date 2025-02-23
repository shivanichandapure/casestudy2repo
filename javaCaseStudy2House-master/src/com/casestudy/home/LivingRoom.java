package com.casestudy.home;

import com.casestudy.devices.Device;
import com.casestudy.interfaces.BedroomDevice;
import com.casestudy.interfaces.EntertainmentDevice;
import com.casestudy.interfaces.LivingRoomDevice;

import java.util.ArrayList;

public class LivingRoom extends Room {
    int deviceId;
    String deviceNames;

    public LivingRoom() {
        this.setName("LivingRoom");
    }
    public LivingRoom(int deviceId, String deviceNames) {
        this.deviceId = deviceId;
        this.deviceNames = deviceNames;
    }
    ArrayList<Device> devices = new ArrayList<>();

    //@Override
    public void addDevice(Device device)
    {
        if (device instanceof LivingRoomDevice) {
            devices.add(device);
            System.out.println(device.getDeviceName() + " added to " + "LivingRoom");
        }
        else {
            System.out.println(device.getDeviceName() + " not added to " + "LivingRoom" + " due to incorrect type.");

        }
    }
    @Override
    public void deleteDevice(int deviceId) {

        Device toRemove = null;
        for (Device device : devices) {
            if (device.getDeviceId() == deviceId) {
                toRemove = device;
                break;
            }
        }
        if (toRemove != null) {
            devices.remove(toRemove);
            System.out.println(toRemove.getDeviceName() + " removed from Kitchen.");
        } else {
            System.out.println("Device with ID " + deviceId + " not found in Kitchen.");
        }

    }

    @Override
    public ArrayList<Device> getDevices() {
        return devices;
    }

    public int getDeviceId() {
        return deviceId;
    }

    public void setDeviceId(int deviceId) {
        this.deviceId = deviceId;
    }

    public String getDeviceName() {
        return deviceNames;
    }

    public void setDeviceNames(String deviceNames) {
        this.deviceNames = deviceNames;
    }

    @Override
    public String toString() {
        return "LivingRoom{" +
                "Room No=" + getRoomNo() +
                ", Devices=" + devices +
                '}';
    }


}
