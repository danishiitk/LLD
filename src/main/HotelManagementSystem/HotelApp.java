import model.*;

import java.time.LocalDateTime;

public class HotelApp {
    public static void main(String[] args) {
        Hotel hotel = new Hotel("Taj");
        Room delexeRoom = new DeluxeRoom(100);
        Room singleRoom = new DeluxeRoom(101);
        hotel.addRoom(delexeRoom);
        hotel.addRoom(singleRoom);
        Guest guest = new Guest();
        Booking deluxeBooking = hotel.checkIn(guest, RoomType.DELUXE, LocalDateTime.now(), LocalDateTime.now().plusDays(5));
        hotel.checkOut(deluxeBooking);
    }
}
