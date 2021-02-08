package TodaysTask.Flight;

public class ShortHaulFlight extends Flight {
    public ShortHaulFlight(String flightCode, String fromTo, String departureTime, int flightDuration) {
        super(flightCode, fromTo, departureTime, flightDuration);
    }

    //To-do polymorphism "check-in-before"
    public String checkInBefore () {
        return "30 min før";
    }

}
