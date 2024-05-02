package model;

public abstract class Room {
    int roomNumber;
    RoomType roomType;
    boolean isBooked;
    Room(RoomType roomType){
        this.roomType = roomType;
        this.isBooked = false;
    }
    public void bookRoom(){
        this.isBooked = true;
    }
    public void vacateRoom(){
        this.isBooked = false;
    }

    public int getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(int roomNumber) {
        this.roomNumber = roomNumber;
    }

    public RoomType getRoomType() {
        return roomType;
    }

    public boolean isBooked() {
        return isBooked;
    }
}
