import model.ParkingTicket;

import java.time.Duration;
import java.time.LocalDateTime;

public class ParkingChargeCalculator {
    int parkingChargePerHour;
    ParkingChargeCalculator(int parkingChargePerHour){
        this.parkingChargePerHour = parkingChargePerHour;
    }
    public int calculateParkingCharge(ParkingTicket parkingTicket){
        LocalDateTime entryTime = parkingTicket.getEntryTime();
        LocalDateTime exitTime = parkingTicket.getExitTime();
        Duration duration = Duration.between(entryTime, exitTime);
        //int noOfHours = (int) duration.toHours();
        //int parkingCharge = parkingChargePerHour*noOfHours;
        int noOfSeconds = (int) duration.toSeconds();
        int parkingCharge = parkingChargePerHour*noOfSeconds;
        return parkingCharge;
    }

    public void setParkingChargePerHour(int parkingChargePerHour) {
        this.parkingChargePerHour = parkingChargePerHour;
    }
}
