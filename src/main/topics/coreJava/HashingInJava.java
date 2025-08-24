package coreJava;

import java.sql.Time;
import java.util.List;

class Flight{
    private int flightNo;
    private String flightName;
    private String source;
    private String destination;
    private Time arrival;
    private Time departure;

    public Flight(int flightNo, String flightName, String source, String destination, Time arrival, Time departure) {
        this.flightNo = flightNo;
        this.flightName = flightName;
        this.source = source;
        this.destination = destination;
        this.arrival = arrival;
        this.departure = departure;
    }

    public int getFlightNo() {
        return flightNo;
    }

    public String getFlightName() {
        return flightName;
    }

    public String getSource() {
        return source;
    }

    public String getDestination() {
        return destination;
    }

    public Time getArrival() {
        return arrival;
    }

    public Time getDeparture() {
        return departure;
    }
}

public class HashingInJava {
    public static void main(String[] args) {
        List<Flight> flightList = List.of(
                new Flight(101, "AirIndia101", "Delhi", "Mumbai", Time.valueOf("09:30:00"), Time.valueOf("10:30:00")),
                new Flight(102, "IndiGo202", "Mumbai", "Bangalore", Time.valueOf("12:00:00"), Time.valueOf("13:00:00")),
                new Flight(103, "SpiceJet303", "Bangalore", "Delhi", Time.valueOf("15:00:00"), Time.valueOf("16:00:00")),
                new Flight(104, "GoAir404", "Delhi", "Chennai", Time.valueOf("11:00:00"), Time.valueOf("12:00:00")),
                new Flight(105, "Vistara505", "Chennai", "Mumbai", Time.valueOf("14:00:00"), Time.valueOf("15:00:00")),
                new Flight(106, "AirIndia101", "Mumbai", "Delhi", Time.valueOf("17:00:00"), Time.valueOf("18:00:00")),
                new Flight(107, "IndiGo606", "Delhi", "Kolkata", Time.valueOf("10:30:00"), Time.valueOf("11:30:00")),
                new Flight(108, "SpiceJet707", "Kolkata", "Bangalore", Time.valueOf("13:00:00"), Time.valueOf("14:00:00")),
                new Flight(109, "GoAir808", "Bangalore", "Chennai", Time.valueOf("16:00:00"), Time.valueOf("17:00:00")),
                new Flight(110, "Vistara909", "Chennai", "Delhi", Time.valueOf("18:00:00"), Time.valueOf("19:00:00"))
        );
        System.out.println(flightList);
    }
}
