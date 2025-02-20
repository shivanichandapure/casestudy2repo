package com.casestudy.home;

import com.casestudy.devices.AC;
import com.casestudy.devices.Device;
import com.casestudy.interfaces.*;

import java.util.ArrayList;
import java.util.Scanner;

public class Room {

    Scanner sc = new Scanner(System.in);
    private int roomNo =0;
    public static int count = 1;
    private String name;
    private boolean status;
    private int noOfDevices;
    private int noOfONDevices;
    private int noOfOFFDevices;

    public Room() {
        roomNo = count++;
    }
    private ArrayList<BedroomDevice> bedroomDevices = new ArrayList<>();
    private ArrayList<KitchenDevice> kitchenDevices = new ArrayList<>();
    private ArrayList<LivingRoomDevice> livingRoomDevices = new ArrayList<>();
    private ArrayList<EntertainmentDevice> entertainmentDevices = new ArrayList<>();
    private ArrayList<WashroomDevice> washDevices = new ArrayList<>();
    private ArrayList<CorridorDevice> corridorDevices = new ArrayList<>();

    public void addDevice(Device device)
    {
        if (device instanceof BedroomDevice && device.getRoomName().equalsIgnoreCase("Bedroom")) {
            bedroomDevices.add((BedroomDevice) device);
            System.out.println(device.getName() + " added to " + device.getRoomName());
        }
        else if (device instanceof KitchenDevice && device.getRoomName().equalsIgnoreCase("Kitchen")) {
            kitchenDevices.add((KitchenDevice) device);
            System.out.println(device.getName() + " added to " + device.getRoomName());
        }
        else if (device instanceof LivingRoomDevice && device.getRoomName().equalsIgnoreCase("LivingRoom")) {
            livingRoomDevices.add((LivingRoomDevice) device);
            System.out.println(device.getName() + " added to " + device.getRoomName());
        }
        else if (device instanceof EntertainmentDevice && device.getRoomName().equalsIgnoreCase("LivingRoom")) {
            entertainmentDevices.add((EntertainmentDevice) device);
            System.out.println(device.getName() + " added to " + device.getRoomName());
        }
        else if (device instanceof WashroomDevice && device.getRoomName().equalsIgnoreCase("WashRoom")) {
            washDevices.add((WashroomDevice) device);
            System.out.println(device.getName() + " added to " + device.getRoomName());
        }
        else if (device instanceof CorridorDevice && device.getRoomName().equalsIgnoreCase("Corridor")) {
            corridorDevices.add((CorridorDevice) device);
            System.out.println(device.getName() + " added to " + device.getRoomName());
        }
        else {
            System.out.println(device.getName() + " not added to " + device.getRoomName() + " due to incorrect type.");
        }
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




    @Override
    public String toString() {
        return "Room{" +
                "roomNo=" + roomNo +
                ", name='" + name + '\'' +
                ", noOfDevices=" + noOfDevices +
                ", noOfONDevices=" + noOfONDevices +
                ", noOfOFFDevices=" + noOfOFFDevices +
                '}' + "\n";
    }


}
