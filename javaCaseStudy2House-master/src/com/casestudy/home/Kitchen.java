package com.casestudy.home;

import com.casestudy.devices.Device;
import com.casestudy.interfaces.KitchenDevice;
import java.util.ArrayList;
public class Kitchen extends Room {

    int roomNo;
    String roomName;
    int deviceId;
    String deviceNames;

    public Kitchen() {

        this.setName("Kitchen");
    }
    public Kitchen(int deviceId, String deviceNames) {
        this.deviceId = deviceId;
        this.deviceNames = deviceNames;
    }

    ArrayList<Device> devices = new ArrayList<>();

    //@Override
    public void addDevice(Device device)
    {
        if (device instanceof KitchenDevice ) {
            devices.add(device);
            System.out.println(device.getDeviceName() + " added to " + "Kitchen");

            System.out.println("Devices in Kitchen: " + devices);
        }
        else {
            System.out.println(device.getDeviceName() + " not added to " + "Kitchen" + " due to incorrect type.");

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
    public int getDeviceId() {
        return deviceId;
    }
    public ArrayList<Device> getDevices() {
        return devices;
    }
    //@Override
    public void setDevices(ArrayList<Device> devices) {
        this.devices = devices;
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
        return "Kitchen{" +
                "Room No=" + getRoomNo() +
                ", Devices=" + devices +
                '}';
    }


}
