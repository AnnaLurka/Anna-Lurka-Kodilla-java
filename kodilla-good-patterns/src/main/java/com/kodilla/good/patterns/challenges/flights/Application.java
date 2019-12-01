package com.kodilla.good.patterns.challenges.flights;

public class Application {

    public static void main(String args[]) {

        FlightSearch flightSearch = new FlightSearch();
        flightSearch.findFlightFrom("Kraków");
        flightSearch.findFlightTo("Kraków");
        flightSearch.findFlightThrough("Kraków");
    }
}
