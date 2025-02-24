// Flight.java
package com.example.flightitinerary;

import java.io.Serializable;

public class Flight implements Serializable {
    private String flightNumber;
    private String departure;
    private String arrival;
    private String duration;

    public Flight(String flightNumber, String departure, String arrival, String duration) {
        this.flightNumber = flightNumber;
        this.departure = departure;
        this.arrival = arrival;
        this.duration = duration;
    }

    public String getFlightNumber() {
        return flightNumber;
    }

    public String getDeparture() {
        return departure;
    }

    public String getArrival() {
        return arrival;
    }

    public String getDuration() {
        return duration;
    }
}
