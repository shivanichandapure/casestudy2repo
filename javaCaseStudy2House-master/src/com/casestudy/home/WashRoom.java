package com.casestudy.home;
import com.casestudy.devices.Device;
import com.casestudy.interfaces.WashroomDevice;

import java.util.ArrayList;

public class WashRoom extends Room {
    int deviceId;
    String deviceNames;

    public WashRoom() {

        this.setName("Washroom");
    }
    public WashRoom(int deviceId, String deviceNames) {
        this.deviceId = deviceId;
        this.deviceNames = deviceNames;
    }
    ArrayList<Device> devices = new ArrayList<>();

   // @Override
    public void addDevice(Device device)
    {
        if (device instanceof WashroomDevice) {
            devices.add(device);
            System.out.println(device.getDeviceName() + " added to " + "WashRoom");
        }
        else {
            System.out.println(device.getDeviceName() + " not added to " + "WashRoom" + " due to incorrect type.");

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
        return "WashRoom{" +
                "Room No=" + getRoomNo() +
                ", Devices=" + devices +
                '}';
    }


}
