package com.casestudy.devices;

import java.time.Duration;
import java.time.LocalDateTime;

public class Device {
    int deviceId;
    String deviceName;

    private long lastOnTime;
    private long  totalOnTime;
    String roomNameofDevice;
    private boolean isOn=false;

    public Device() {
    }

    public Device(int deviceId, String deviceName) {
        this.deviceId = deviceId;
        this.deviceName = deviceName;
    }
    public boolean isOn() {
        return isOn;
    }
    public int getDeviceId() {
        return deviceId;
    }

    public void setDeviceId(int deviceId) {
        this.deviceId = deviceId;
    }

    public String getDeviceName() {
        return deviceName;
    }

    public void setDeviceName(String deviceName) {
        this.deviceName = deviceName;
    }

    public String getRoomNameofDevice() {
        return roomNameofDevice;
    }

    public void setRoomNameofDevice(String roomNameofDevice) {
        this.roomNameofDevice = roomNameofDevice;
    }
    public void turnOn() {

        isOn = true;
        lastOnTime = System.currentTimeMillis();
        System.out.println(deviceName + " is now ON.");
    }

    public void turnOff() {
        this.isOn = false;
        totalOnTime += (System.currentTimeMillis() - lastOnTime); // Add elapsed time
        System.out.println(deviceName + " is now OFF.");
    }
    public long checkTotalOnTime() {
        if (isOn) {
            return totalOnTime + (System.currentTimeMillis() - lastOnTime); // Include current session
        }
        return totalOnTime;
    }
    @Override
    public String toString() {
        return "Device{" +
                "deviceId=" + deviceId +
                ", deviceName='" + deviceName + '\'' +
                ", Status='" + (isOn ? "ON" : "OFF") +
                '}';
    }
}
