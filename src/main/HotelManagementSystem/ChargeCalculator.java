import model.Booking;

import java.time.Duration;

public class ChargeCalculator {
    int perDayCharge;
    ChargeCalculator(int perDayCharge){
        this.perDayCharge = perDayCharge;
    }
    public int calculateCharge(Booking booking) {
        Duration duration = Duration.between(booking.getCheckInDate(), booking.getGetCheckOutDate());
        int days = (int) duration.toDays();
        int totalCharge = perDayCharge*days;
        return totalCharge;
    }
}
