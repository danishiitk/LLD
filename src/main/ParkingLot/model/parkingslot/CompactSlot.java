package model.parkingslot;

public class CompactSlot extends ParkingSlot{
    public CompactSlot(int slotNumber) {
        super(SlotType.COMPACT);
        super.slotNumber = slotNumber;
    }
}
