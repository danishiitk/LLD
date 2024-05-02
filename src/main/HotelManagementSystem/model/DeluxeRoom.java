package model;

public class DeluxeRoom extends Room{
    public DeluxeRoom(int roomNumber) {
        super(RoomType.DELUXE);
        super.roomNumber = roomNumber;
    }
}
