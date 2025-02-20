package com.casestudy.app;

import com.casestudy.devices.*;
import com.casestudy.home.*;
import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        House house = new House();
        Room room = new Room();

        int sizeOfRooms = house.getRooms().size();
        System.out.println(sizeOfRooms);

        //ArrayList<Room> temp = house.getRooms();
//        for (int i = 0; i < sizeOfRooms; i++) {
//            house.getRooms().get(i).setNoOfDevices(3);
//        }
        System.out.println(house.getRooms());

        boolean iswhile= true;

        while (iswhile) {

            System.out.println("Enter 1 to add room\nEnter 2 for add device in room\n");

            int choice = sc.nextInt();
            switch (choice) {
                case 1 -> {
                    System.out.println("Enter type of Room");
                    System.out.println("Press 1 for Kitchen");
                    System.out.println("Press 2 for Bedroom");
                    System.out.println("Press 3 for Living Room");
                    System.out.println("Press 4 for Washroom");
                    System.out.println("Press 5 for Corridor");

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

                    System.out.println("Enter the Room Name to add a device:");
                    for (Room rooms: house.getRooms()) {
                        System.out.println("Room: " + rooms.getName());
                    }

                    String roomName = sc.next();

                    System.out.println("Enter type of Device");
                    System.out.println("Press 1 for AC");
                    System.out.println("Press 2 for Geyser");
                    System.out.println("Press 3 for Music Player");
                    System.out.println("Press 4 for TV");
                    System.out.println("Press 5 for Refrigerator");
                    System.out.println("Press 6 for Light");

                    int typeChoice = sc.nextInt();

                    switch (typeChoice)
                    {
                        case 1-> room.addDevice(new AC(1,roomName,true));
                        case 2-> room.addDevice(new Geyser(2,roomName,true));
                        case 3-> room.addDevice(new MusicPlayer(3,roomName,true));
                        case 4-> room.addDevice(new TV(4,roomName,true));
                        case 5-> room.addDevice(new Refrigerator(5,roomName,true));
                        case 6-> room.addDevice(new Light(6,roomName,true));
                    }
                }
                default -> System.out.println("Invalid choice! Please try again.");
            }
        }
        System.out.println(house);

    }
}