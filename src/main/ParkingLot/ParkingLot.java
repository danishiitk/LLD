import model.ParkingTicket;
import model.ParkingTicketStatus;
import model.parkingslot.ParkingSlot;
import model.parkingslot.SlotType;
import model.vehicle.Vehicle;
import model.vehicle.VehicleType;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

public class ParkingLot {
    int filledSmallSlots;
    int filledCompactSlots;
    int filledLargeSlots;
    final int totalSmallSlots;
    final int totalCompactSlots;
    final int totalLargeSlots;
    Map<String, ParkingFloor> parkingFloorMap;
    Map<Integer, ParkingTicket> activeParkingTickets;
    ParkingChargeCalculator parkingChargeCalculator;
    private ParkingLot(){
        totalSmallSlots = 4;
        totalCompactSlots = 4;
        totalLargeSlots = 2;
        filledSmallSlots = 0;
        filledCompactSlots = 0;
        filledLargeSlots = 0;
        this.parkingFloorMap = new HashMap<>();
        this.activeParkingTickets = new HashMap<>();
        parkingChargeCalculator = new ParkingChargeCalculator(1);
    }
    public void addParkingFloor(ParkingFloor parkingFloor){
        parkingFloorMap.put(parkingFloor.getName(), parkingFloor);
    }

    public void removeParkingFloor(ParkingFloor parkingFloor){
        parkingFloorMap.remove(parkingFloor);
    }

    public static ParkingLot parkingLot;
    public static ParkingLot getInstance(){
        if(parkingLot == null)
            parkingLot = new ParkingLot();
        return parkingLot;
    }
    public ParkingTicket getParkingTicket(Vehicle vehicle){
        if(isFull(vehicle)){
            System.out.println("Parking Lot is full for: "+vehicle.getVehicleType());
            return null;
        }
        ParkingSlot freeParkingSlot = getAndFillASlot(vehicle);

        ParkingTicket parkingTicket = new ParkingTicket((int) Math.random());
        parkingTicket.setEntryTime(LocalDateTime.now());
        parkingTicket.setParkingTicketStatus(ParkingTicketStatus.ACTIVE);
        parkingTicket.addSlot(freeParkingSlot);
        vehicle.assignTicket(parkingTicket);
        activeParkingTickets.put(parkingTicket.getTicketId(), parkingTicket);
        return parkingTicket;
    }

    public void checkOut(ParkingTicket parkingTicket){
        LocalDateTime exitTime = LocalDateTime.now();
        parkingTicket.setExitTime(exitTime);
        int parkingCharges = parkingChargeCalculator.calculateParkingCharge(parkingTicket);
        parkingTicket.setParkingCharges(parkingCharges);
        System.out.println("Please pay: "+parkingCharges);
        System.out.println("Check out successful");
        parkingTicket.setParkingTicketStatus(ParkingTicketStatus.PAID);
        ParkingSlot assignedParkingSlot = parkingTicket.getParkingSlot();
        assignedParkingSlot.vacate();
    }

    private ParkingSlot getAndFillASlot(Vehicle vehicle) {
        VehicleType vehicleType = vehicle.getVehicleType();
        for(Map.Entry<String, ParkingFloor> entry: parkingFloorMap.entrySet()){
            String floorName = entry.getKey();
            ParkingFloor parkingFloor = entry.getValue();
            ParkingSlot freeParkingSlot = parkingFloor.bookSlot(vehicle);
            if(freeParkingSlot != null){
                if(freeParkingSlot.getSlotType() == SlotType.SMALL)
                    filledSmallSlots++;
                else if(freeParkingSlot.getSlotType() == SlotType.COMPACT)
                    filledCompactSlots++;
                else if(freeParkingSlot.getSlotType() == SlotType.LARGE)
                    filledLargeSlots++;
                System.out.println("Assigned Floor: "+floorName+" and SlotType: "+freeParkingSlot.getSlotType().toString()+" Slot Number:"+freeParkingSlot.getSlotNumber());
                return freeParkingSlot;
            }
        }
        System.out.println("No slot available on any floor");
        return null;
    }

    private boolean isFull(Vehicle vehicle) {
        VehicleType vehicleType = vehicle.getVehicleType();
        switch (vehicleType){
            case BIKE:{
                if(filledSmallSlots<totalSmallSlots)
                    return false;
                break;
            }
            case CAR:{
                if(filledCompactSlots+filledLargeSlots<totalCompactSlots+totalLargeSlots)
                    return false;
                break;
            }
            case BUS:{
                if(filledLargeSlots<totalLargeSlots)
                    return false;
                break;
            }
            default: System.out.println("Invalid Vehicle Type");
        }
        return true;
    }
}
