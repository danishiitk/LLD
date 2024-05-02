import model.*;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Hotel {
    String name;
    String location;
    List<Room> roomList;
    List<Booking> activeBookings;
    ChargeCalculator chargeCalculator;
    Hotel(String name){
        this.roomList = new ArrayList<>();
        this.activeBookings = new ArrayList<>();
        this.chargeCalculator = new ChargeCalculator(10);
    }
    public void addRoom(Room room){
        roomList.add(room);
    }
    public void removeRoom(Room room){
        this.roomList.remove(room);
    }
    public Booking checkIn(Guest guest, RoomType roomType, LocalDateTime checkInDate, LocalDateTime checkOutDate){
        Room toBeBookedRoom = null;
        for(Room room: roomList){
            if(room.getRoomType() == roomType && !room.isBooked()) {
                toBeBookedRoom = room;
            }
        }
        //Create a booking
        Booking booking = null;
        if(toBeBookedRoom != null){
            booking = new Booking(1, guest, toBeBookedRoom, checkInDate, checkOutDate);
            System.out.println("Room: "+toBeBookedRoom.getRoomNumber()+" booked"+roomType.toString());
        } else
            System.out.println("Room: "+roomType.toString()+" not available");
        activeBookings.add(booking);
        return booking;
    }
    public void checkOut(Booking booking){
        //Vacate the room
        Room bookedRoom = booking.getRoom();
        bookedRoom.vacateRoom();
        //Pay and remove the booking
        int charge = chargeCalculator.calculateCharge(booking);
        activeBookings.remove(booking);
        System.out.println("Please pay: "+charge);
        booking.setBookingStatus(BookingStatus.PAID);
        System.out.println("Checkout successful");
    }
}
