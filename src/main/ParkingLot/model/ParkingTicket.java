package model;

import model.parkingslot.ParkingSlot;
import model.vehicle.Vehicle;

import java.time.LocalDateTime;

public class ParkingTicket {
    int ticketId;
    ParkingTicketStatus parkingTicketStatus;
    LocalDateTime entryTime;
    LocalDateTime exitTime;
    int parkingCharges;
    private ParkingSlot parkingSlot;


    public ParkingTicket(int ticketId){
        this.ticketId=ticketId;
    }
    public int getTicketId() {
        return ticketId;
    }

    public void setTicketId(int ticketId) {
        this.ticketId = ticketId;
    }

    public ParkingTicketStatus getParkingTicketStatus() {
        return parkingTicketStatus;
    }

    public void setParkingTicketStatus(ParkingTicketStatus parkingTicketStatus) {
        this.parkingTicketStatus = parkingTicketStatus;
    }

    public LocalDateTime getEntryTime() {
        return entryTime;
    }

    public void setEntryTime(LocalDateTime entryTime) {
        this.entryTime = entryTime;
    }

    public LocalDateTime getExitTime() {
        return exitTime;
    }

    public void setExitTime(LocalDateTime exitTime) {
        this.exitTime = exitTime;
    }

    public int getParkingCharges() {
        return parkingCharges;
    }

    public void setParkingCharges(int parkingCharges) {
        this.parkingCharges = parkingCharges;
    }

    public void addSlot(ParkingSlot freeParkingSlot) {
        this.parkingSlot = freeParkingSlot;
    }

    public ParkingSlot getParkingSlot() {
        return parkingSlot;
    }
}
