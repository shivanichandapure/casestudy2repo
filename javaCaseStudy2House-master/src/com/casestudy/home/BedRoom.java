package com.casestudy.home;

import com.casestudy.devices.Device;
import com.casestudy.interfaces.BedroomDevice;
import com.casestudy.interfaces.KitchenDevice;

import java.util.ArrayList;

public class BedRoom extends Room {

    int deviceId;
    String deviceNames;

    public BedRoom() {
        this.setName("BedRoom");
    }
    public BedRoom(int deviceId, String deviceNames) {
        this.deviceId = deviceId;
        this.deviceNames = deviceNames;
    }
    ArrayList<Device> devices = new ArrayList<>();

    @Override
    public void addDevice(Device device)
    {
        if (device instanceof BedroomDevice) {
            devices.add(device);
            System.out.println(device.getDeviceName() + " added to " + "BedRoom");
            System.out.println("Devices in Bedroom: " + devices);

        }
        else {
            System.out.println(device.getDeviceName() + " not added to " + "BedRoom" + " due to incorrect type.");
        }
    }

    @Override
    public void deleteDevice(int deviceId)
    {
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

    @Override
    public String toString() {
        return "BedRoom{" +
                "Room No=" + getRoomNo() +
                ", Devices=" + devices +
                '}';
    }

}
