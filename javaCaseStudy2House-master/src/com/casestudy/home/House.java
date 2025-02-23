package com.casestudy.home;
import java.util.ArrayList;
public class House {
    private ArrayList<Room> rooms = new ArrayList<>();

    String roomName;
    public House() {
        rooms.add(new Kitchen());
        rooms.add(new BedRoom());
        rooms.add(new WashRoom());
        rooms.add(new Corridor());
        rooms.add(new LivingRoom());
    }
    public void addRoom(Room room) {
        rooms.add(room);
    }

    public ArrayList<Room> getRooms() {
        return rooms;
    }

    @Override
    public String toString() {
        return "House{" +
                "rooms=" + rooms +
                '}';
    }
    public void deleteRoom(int roomNo)
    {
        Room toRemove = null;
        for (Room room : rooms) {
            if (room.getRoomNo() == roomNo) {
                toRemove = room;
                break;
            }
        }
        if (toRemove != null) {
            rooms.remove(toRemove);
            System.out.println( toRemove.getName() +  " is removed");
        } else {
            System.out.println("Room with ID " + roomNo + " not found ");
        }
    }

    public String getRoomNameByNumber(int roomNo) {
        for (Room room : rooms) {
            if (room.getRoomNo() == roomNo) {
                return room.getName(); // Return room name
            }
        }
        return "Room not found!";
    }

    public void deleteDevice(int roomNo, int deviceId) {

        for (Room room : rooms) {
            if (room.getRoomNo() == roomNo) {
                room.deleteDevice(deviceId);
                return;
            }
        }
        System.out.println("Room with ID " + roomNo + " not found.");
    }


}
