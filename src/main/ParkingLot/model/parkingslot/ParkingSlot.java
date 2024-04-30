package model.parkingslot;

import model.vehicle.Vehicle;

public abstract class ParkingSlot {
    int slotNumber;
    SlotType slotType;
    Vehicle vehicle;
    boolean isFree;
    ParkingSlot(SlotType slotType){
        this.slotType = slotType;
        isFree = true;
    }
    public void book(Vehicle vehicle){
        this.vehicle = vehicle;
        isFree = false;
    }
    public void vacate(){
        this.vehicle = null;
        isFree = true;
    }
    public Vehicle getVehicle() {
        return vehicle;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    public int getSlotNumber() {
        return slotNumber;
    }

    public void setSlotNumber(int slotNumber) {
        this.slotNumber = slotNumber;
    }

    public SlotType getSlotType() {
        return slotType;
    }

    public void setSlotType(SlotType slotType) {
        this.slotType = slotType;
    }

    public boolean isFree() {
        return isFree;
    }

    public void setFree(boolean free) {
        isFree = free;
    }
}
