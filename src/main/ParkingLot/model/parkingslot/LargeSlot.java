package model.parkingslot;

public class LargeSlot extends ParkingSlot{
    public LargeSlot(int slotNumber){
        super(SlotType.LARGE);
        super.slotNumber = slotNumber;
    }
}
