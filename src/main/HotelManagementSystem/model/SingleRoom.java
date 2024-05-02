package model;

public class SingleRoom extends Room{

    SingleRoom(int roomNumber) {
        super(RoomType.SINGLE);
        super.roomNumber = roomNumber;
    }
}
