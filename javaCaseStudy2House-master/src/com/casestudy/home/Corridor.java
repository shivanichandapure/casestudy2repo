package com.casestudy.home;

import com.casestudy.devices.Device;
import com.casestudy.interfaces.BedroomDevice;
import com.casestudy.interfaces.CorridorDevice;

import java.util.ArrayList;

public class Corridor extends Room{
    int deviceId;
    String deviceNames;

    public Corridor() {

        this.setName("Corridor");
    }
    public Corridor(int deviceId, String deviceNames) {
        this.deviceId = deviceId;
        this.deviceNames = deviceNames;
    }

    ArrayList<Device> devices = new ArrayList<>();

    @Override
    public void addDevice(Device device)
    {
        if (device instanceof CorridorDevice) {
            devices.add(device);
            System.out.println(device.getDeviceName() + " added to " + "Corridor");
        }
        else {
            System.out.println(device.getDeviceName() + " not added to " + "Corridor" + " due to incorrect type.");

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

    @Override
    public String toString() {
        return "Corridor{" +
                "Room No=" + getRoomNo() +
                ", Devices=" + devices +
                '}';
    }
}
