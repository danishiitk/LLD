import java.util.HashMap;
import java.util.Map;

public class ParkingLot {
    Map<String, ParkingFloor> parkingFloorMap = new HashMap<>();
    public static ParkingLot parkingLot;
    public static ParkingLot getInstance(){
        if(parkingLot == null)
            parkingLot = new ParkingLot();
        return parkingLot;
    }
}
