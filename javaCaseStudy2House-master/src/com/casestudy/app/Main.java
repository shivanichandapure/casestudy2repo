package com.casestudy.app;
import com.casestudy.devices.*;
import com.casestudy.home.*;
import java.util.ArrayList;
import java.util.Scanner;
public class Main {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {

        House house = new House();
        Kitchen kitchen= new Kitchen();

        ArrayList<Device> devices= new ArrayList<>();
        boolean iswhile= true;

        while (iswhile) {

            System.out.println("Enter 1 to add room\nEnter 2 for add device in room");
            System.out.println("Enter 3 check status of device\nEnter 4 for delete room");
            System.out.println("Enter 5 for delete devices\nEnter 6 to check total on time of device.");
            System.out.println("Enter 7 to see status of each room and devices in it.\n");

            int choice = sc.nextInt();
            switch (choice) {
                case 1 -> {
                    System.out.println("Enter type of Room\n");
                    System.out.println("Press 1 for Kitchen");
                    System.out.println("Press 2 for Bedroom");
                    System.out.println("Press 3 for Living Room");
                    System.out.println("Press 4 for Washroom");
                    System.out.println("Press 5 for Corridor\n");

                    int typeChoice = sc.nextInt();

                    switch (typeChoice) {
                        case 1 -> house.addRoom(new Kitchen());
                        case 2 -> house.addRoom(new BedRoom());
                        case 3 -> house.addRoom(new LivingRoom());
                        case 4 -> house.addRoom(new WashRoom());
                        case 5 -> house.addRoom(new Corridor());
                    }
                }
                case 2 -> {

                    System.out.println("Enter the Room No to add a device\n");
                    System.out.println("Press 1 for Kitchen");
                    System.out.println("Press 2 for Bedroom");
                    System.out.println("Press 3 for Washroom");
                    System.out.println("Press 4 for Corridor");
                    System.out.println("Press 5 for Living Room\n");

                    int roomNo= sc.nextInt();
                    Room room = null;

                    for (Room r : house.getRooms()) {
                        if (r.getRoomNo() == roomNo) {
                            room = r;
                            break;
                        }
                    }
                    if (room == null) {
                        System.out.println("Invalid room number!");
                        return;
                    }
                    System.out.println("Enter type of Device:");
                    System.out.println("Press 1 for AC");
                    System.out.println("Press 2 for Geyser");
                    System.out.println("Press 3 for Music Player");
                    System.out.println("Press 4 for TV");
                    System.out.println("Press 5 for Refrigerator");
                    System.out.println("Press 6 for Light\n");

                    int typeChoice = sc.nextInt();
                    Device device = null;

                    switch (typeChoice) {
                        case 1 -> device = new AC(1, "AC");
                        case 2 -> device = new Geyser(2, "Geyser");
                        case 3 -> device = new MusicPlayer(3, "Music Player");
                        case 4 -> device = new TV(4, "TV");
                        case 5 -> device = new Refrigerator(5, "Refrigerator");
                        case 6 -> device = new Light(6, "Light");
                        default -> System.out.println("Invalid device choice.");
                    }
                    if (device != null) {
                        room.addDevice(device);
                        devices.add(device);
                    }
                }
                case 3 -> {
                    System.out.println("Enter Room No to toggle a device:");

                    System.out.println("Press 1 for Kitchen");
                    System.out.println("Press 2 for Bedroom");
                    System.out.println("Press 3 for Washroom");
                    System.out.println("Press 4 for Corridor");
                    System.out.println("Press 5 for Living Room\n");

                    int roomChoice = sc.nextInt();
                    Room selectedRoom = null;

                    for (Room r : house.getRooms()) {
                        if (r.getRoomNo() == roomChoice) {
                            selectedRoom = r;
                            break;
                        }
                    }
                    if (selectedRoom != null) {

                        System.out.println("Enter Device ID to toggle:");

                        System.out.println("Press 1 for AC");
                        System.out.println("Press 2 for Geyser");
                        System.out.println("Press 3 for Music Player");
                        System.out.println("Press 4 for TV");
                        System.out.println("Press 5 for Refrigerator");
                        System.out.println("Press 6 for Light\n");

                        int deviceId = sc.nextInt();
                        Device selectedDevice = null;

                        for (Device d : selectedRoom.getDevices()) {
                            if (d.getDeviceId() == deviceId) {
                                selectedDevice = d;
                                break;
                            }
                        }

                        if (selectedDevice != null) {

                            if (selectedDevice.isOn()) {
                                selectedDevice.turnOff();

                            } else {
                                selectedDevice.turnOn();
                            }
                        } else {
                            System.out.println("Device with ID " + deviceId + " not found in the selected room.");
                        }
                    } else {
                        System.out.println("Invalid Room Choice.");
                    }
                }
                case 4->{
                    System.out.println("Enter Room No to delete room.\n");

                    System.out.println("Press 1 for Kitchen");
                    System.out.println("Press 2 for Bedroom");
                    System.out.println("Press 3 for Washroom");
                    System.out.println("Press 4 for Corridor");
                    System.out.println("Press 5 for Living Room\n");

                    int roomNo= sc.nextInt();
                    house.deleteRoom(roomNo);
                }
                case 5->{

                    System.out.println("Enter Room No where the device is located:");
                    System.out.println("Press 1 for Kitchen");
                    System.out.println("Press 2 for Bedroom");
                    System.out.println("Press 3 for Washroom");
                    System.out.println("Press 4 for Corridor");
                    System.out.println("Press 5 for Living Room\n");

                    int roomNo = sc.nextInt();

                    System.out.println("Enter type of Device:");
                    System.out.println("Press 1 for AC");
                    System.out.println("Press 2 for Geyser");
                    System.out.println("Press 3 for Music Player");
                    System.out.println("Press 4 for TV");
                    System.out.println("Press 5 for Refrigerator");
                    System.out.println("Press 6 for Light\n");

                    int deviceId = sc.nextInt();

                    house.deleteDevice(roomNo, deviceId);
                }
                case 6->
                {
                    System.out.println("Enter the Room No to check total ON time:\n");

                    System.out.println("Press 1 for Kitchen");
                    System.out.println("Press 2 for Bedroom");
                    System.out.println("Press 3 for Washroom");
                    System.out.println("Press 4 for Corridor");
                    System.out.println("Press 5 for Living Room\n");

                    int roomNo = sc.nextInt();
                    Room room = null;

                    for (Room r : house.getRooms()) {
                        if (r.getRoomNo() == roomNo) {
                            room = r;
                            break;
                        }
                    }
                    if (room != null) {
                         room.checkTotalOnTime();
                    } else {
                        System.out.println("Invalid room number!");
                    }
                }
                case 7->{

                    System.out.println("Enter the Room No to check status\n");
                    System.out.println("Press 1 for Kitchen");
                    System.out.println("Press 2 for Bedroom");
                    System.out.println("Press 3 for Washroom");
                    System.out.println("Press 4 for Corridor");
                    System.out.println("Press 5 for Living Room\n\n");

                    int roomNo= sc.nextInt();
                    Room room = null;

                    for (Room r : house.getRooms()) {
                        if (r.getRoomNo() == roomNo) {
                            room = r;
                            break;
                        }
                    }
                    if (room != null) {
                        room.checkStatusofRoom(roomNo);
                    }
                }
                default -> System.out.println("Invalid choice! Please try again.");
            }

        }
    }
}