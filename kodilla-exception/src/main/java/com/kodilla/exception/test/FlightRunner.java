package com.kodilla.exception.test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class FlightRunner {

    public void findFlight(Flight flight) throws RouteNotFoundException{


        Map<String, Boolean> flightMap = new HashMap<>();
        flightMap.put("Cracow", true);
        flightMap.put("Warsaw", true);
        flightMap.put("Gdańsk", false);
        flightMap.put("Poznań", true);
        flightMap.put("Rzeszów", false);


        if(flightMap.containsKey(flight.getArrivalAirport()) && flightMap.containsKey(flight.getDepartureAirport())) {
            if (flightMap.get(flight.getArrivalAirport()) && (flightMap.get(flight.getDepartureAirport()))) {
                System.out.println("There is a connection.");

            } else {
                System.out.println("There is no connection.");
            }

        } else {
            throw new RouteNotFoundException("Route not found.");
        }
    }

    public static void main(String[] args) {

        FlightRunner flightRunner = new FlightRunner();

        try {
            flightRunner.findFlight(new Flight("Cracow" , "Warsaw"));
            flightRunner.findFlight(new Flight("Cracow" , "Rzeszów"));
            flightRunner.findFlight(new Flight("Cracow" , "Wieliczka"));

        } catch (RouteNotFoundException e) {
            System.out.println("There is no such an airport.");

        } finally{
            System.out.println("The end of search.");
        }
    }
}
