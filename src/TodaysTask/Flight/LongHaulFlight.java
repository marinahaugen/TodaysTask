package TodaysTask.Flight;

import java.util.Calendar;

public class LongHaulFlight extends Flight {

    public LongHaulFlight(String flightCode, String fromTo, String departureTime, int flightDuration) {
        super(flightCode, fromTo, departureTime, flightDuration);
    }

    public String checkInBefore () {
        return "60 min før";
    }
}
