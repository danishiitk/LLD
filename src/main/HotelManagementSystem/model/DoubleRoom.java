package model;

public class DoubleRoom extends Room{
    DoubleRoom(int roomNumber) {
        super(RoomType.DELUXE);
        super.roomNumber = roomNumber;
    }
}
