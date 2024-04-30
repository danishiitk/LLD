import model.ParkingTicket;
import model.parkingslot.ParkingSlot;
import model.parkingslot.SlotType;
import model.vehicle.Vehicle;
import model.vehicle.VehicleType;

import java.util.ArrayList;
import java.util.List;

public class ParkingFloor {
    String name;
    List<ParkingSlot> parkingSlotList = new ArrayList<>();
    public void addParkingSlot(ParkingSlot parkingSlot){
        parkingSlotList.add(parkingSlot);
    }
    public void removeParkingSlot(ParkingSlot parkingSlot){
        parkingSlotList.remove(parkingSlot);
    }
    public ParkingSlot bookSlot(Vehicle vehicle){
        for(ParkingSlot parkingSlot: parkingSlotList) {
            if (parkingSlot.isFree()) {
                if (vehicle.getVehicleType() == VehicleType.BIKE && parkingSlot.getSlotType() == SlotType.SMALL) {
                    parkingSlot.book(vehicle);
                    return parkingSlot;
                } else if (vehicle.getVehicleType() == VehicleType.CAR && (parkingSlot.getSlotType() == SlotType.COMPACT || parkingSlot.getSlotType()==SlotType.LARGE)) {
                    parkingSlot.book(vehicle);
                    return parkingSlot;
                } else if(vehicle.getVehicleType() == VehicleType.BUS && parkingSlot.getSlotType() == SlotType.LARGE){
                    parkingSlot.book(vehicle);
                    return parkingSlot;
                }
            }
        }
        return null;
    }
    public void vacateSlot(ParkingSlot parkingSlot){
        parkingSlot.vacate();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<ParkingSlot> getParkingSlotList() {
        return parkingSlotList;
    }

    public void setParkingSlotList(List<ParkingSlot> parkingSlotList) {
        this.parkingSlotList = parkingSlotList;
    }
}
