package com.casestudy.devices;

public class Device {
    private int id;
    private String name;
    private  String roomName;
    private boolean status;

    public Device(int id, String name,String roomName, boolean status) {
        this.id = id;
        this.name = name;
        this.roomName= roomName;
        this.status = this.status;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public String getRoomName() {
        return roomName;
    }
    public void setRoomName(String roomName) {
        this.roomName = roomName;
    }
}
