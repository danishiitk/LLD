import model.ParkingTicket;
import model.parkingslot.CompactSlot;
import model.parkingslot.LargeSlot;
import model.parkingslot.ParkingSlot;
import model.parkingslot.SmallSlot;
import model.vehicle.Bike;
import model.vehicle.Bus;
import model.vehicle.Car;
import model.vehicle.Vehicle;

public class ParkingApp {
    public static void main(String[] args) throws InterruptedException {
        ParkingLot parkingLot = ParkingLot.getInstance();
        ParkingFloor firstFloor = new ParkingFloor();
        firstFloor.setName("FIRST");
        //Add small, compact, large slots in first floor
        for(int i=100; i<=106; i++){
            if(i<=102)
                firstFloor.addParkingSlot(new SmallSlot(i)); //Add small slots
            else if(103<=i && i<=104)
                firstFloor.addParkingSlot(new CompactSlot(i));
            else
                firstFloor.addParkingSlot(new LargeSlot(i));
        }

        ParkingFloor secondFloor = new ParkingFloor();
        secondFloor.setName("SECOND");
        //Add small, compact, large slots in second floor
        for(int i=200; i<=206; i++){
            if(i<=202)
                secondFloor.addParkingSlot(new SmallSlot(i)); //Add small slots
            else if(203<=i && i<=204)
                secondFloor.addParkingSlot(new CompactSlot(i));
//            else
//                secondFloor.addParkingSlot(new LargeSlot(i));
        }
        parkingLot.addParkingFloor(firstFloor);
        parkingLot.addParkingFloor(secondFloor);

        //Create a vehicle
        Vehicle bus1 = new Bus();
        //Check in bus1
        ParkingTicket parkingTicket1 = parkingLot.getParkingTicket(bus1);

        Vehicle bus2 = new Bus();
        //Check in bus2
        ParkingTicket parkingTicket2 = parkingLot.getParkingTicket(bus2);

        Vehicle bus3 = new Bus();
        //Check in bus2
        ParkingTicket parkingTicket3 = parkingLot.getParkingTicket(bus3);


        Thread.sleep(5000);
        //check out bus 1
        parkingLot.checkOut(parkingTicket1);
    }
}
