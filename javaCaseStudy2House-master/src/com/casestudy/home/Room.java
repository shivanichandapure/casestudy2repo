package com.casestudy.home;

import com.casestudy.devices.AC;
import com.casestudy.devices.Device;

import java.util.ArrayList;

abstract public class Room {
    private int roomNo =0;
    public static int count = 1;
    private String name;
    private int noOfDevices;
    private int noOfONDevices;
    private int noOfOFFDevices;


    public Room() {
        roomNo = count++;
    }

    public int assignRoomNo(){
        return ++roomNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNoOfDevices() {
        return noOfDevices;
    }

    public void setNoOfDevices(int noOfDevices) {
        this.noOfDevices = noOfDevices;
    }

    public int getNoOfONDevices() {
        return noOfONDevices;
    }

    public void setNoOfONDevices(int noOfONDevices) {
        this.noOfONDevices = noOfONDevices;
    }

    public int getNoOfOFFDevices() {
        return noOfOFFDevices;
    }

    public void setNoOfOFFDevices(int noOfOFFDevices) {
        this.noOfOFFDevices = noOfOFFDevices;
    }

    public int getRoomNo() {
        return roomNo;
    }

    public void setRoomNo(int roomNo) {
        this.roomNo = roomNo;
    }

    abstract public void addDevice(Device device);

    public abstract void deleteDevice(int deviceId);

    abstract public ArrayList<Device> getDevices();

    public void turnOnDevice(int deviceId) {
        for (Device device : getDevices()) {
            if (device.getDeviceId() == deviceId) {
                device.turnOn();
                return;
            }
        }

        System.out.println("Device with ID " + deviceId + " not found in " + getName());
    }
    public void turnOfDevice(int deviceId) {
        for (Device device : getDevices()) {
            if (device.getDeviceId() == deviceId) {
                device.turnOn();
                return;
            }
        }

        System.out.println("Device with ID " + deviceId + " not found in " + getName());
    }
    @Override
    public String toString() {
        return "Room{" +
                "roomNo=" + roomNo +
                ", name='" + name + '\'' +
                ", noOfDevices=" + noOfDevices +
                ", noOfONDevices=" + noOfONDevices +
                ", noOfOFFDevices=" + noOfOFFDevices +
                ", devices=" + getDevices() +  // Include devices list

                '}' + "\n";
    }
    public void checkStatusofRoom(int roomNo) {

        int totalDevices = getDevices().size();
        long onDevices = getDevices().stream().filter(Device::isOn).count();
        long offDevices = totalDevices - onDevices;

        System.out.println("\n Room: " + getName());
        System.out.println(" Total Devices: " + totalDevices);
        System.out.println(" Devices ON: " + onDevices);
        System.out.println(" Devices OFF:" + offDevices);
        System.out.println(" \nDevice List:");

        for (Device d : getDevices()) {
            System.out.println("-" + d.getDeviceName() + " ( ON: " + d.isOn() + ")\n");
        }
    }
    public long checkTotalOnTime()
    {
        long totalTime = 0;
        for (Device device : getDevices()) {
            totalTime += device.checkTotalOnTime();

            System.out.println("Device Name: " + device.getDeviceName() + " \n" + "Totoal On Time: " + totalTime / 1000 +"seconds\n");
        }
        return totalTime;

    }
}

