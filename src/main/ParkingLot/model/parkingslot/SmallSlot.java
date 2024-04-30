package model.parkingslot;

public class SmallSlot extends ParkingSlot{
    public SmallSlot(int slotNumber) {
        super(SlotType.SMALL);
        super.slotNumber = slotNumber;
    }
}
