package model;

import java.time.LocalDateTime;

public class Booking {
    int bookingId;
    BookingStatus bookingStatus;
    Guest guest;
    Room room;
    LocalDateTime checkInDate;
    LocalDateTime getCheckOutDate;
    int charge;
    public Booking(int bookingId, Guest guest, Room room, LocalDateTime checkInDate, LocalDateTime getCheckOutDate) {
        this.bookingId = bookingId;
        this.guest = guest;
        this.room = room;
        this.checkInDate = checkInDate;
        this.getCheckOutDate = getCheckOutDate;
        this.bookingStatus = BookingStatus.ACTIVE;
        this.room.bookRoom();
    }

    public int getBookingId() {
        return bookingId;
    }

    public void setBookingId(int bookingId) {
        this.bookingId = bookingId;
    }

    public BookingStatus getBookingStatus() {
        return bookingStatus;
    }

    public void setBookingStatus(BookingStatus bookingStatus) {
        this.bookingStatus = bookingStatus;
    }

    public int getCharge() {
        return charge;
    }

    public void setCharge(int charge) {
        this.charge = charge;
    }

    public Room getRoom() {
        return room;
    }

    public void setRoom(Room room) {
        this.room = room;
    }

    public LocalDateTime getCheckInDate() {
        return checkInDate;
    }

    public LocalDateTime getGetCheckOutDate() {
        return getCheckOutDate;
    }

    public Guest getGuest() {
        return guest;
    }
}
