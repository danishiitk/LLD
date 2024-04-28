package singleton;

public class ParkingLot {
    public static ParkingLot parkingLot;
    private ParkingLot(){
    }
    public static ParkingLot createInstance() {
        if(parkingLot==null){
            parkingLot = new ParkingLot();
        }
        return parkingLot;
    }
}
