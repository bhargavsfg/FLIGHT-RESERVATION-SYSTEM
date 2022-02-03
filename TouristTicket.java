package flight.reservation.System;

import java.util.ArrayList;

public class TouristTicket {
    String ticketName;
    String pnrNumber;
    String departureLocation;
    String destination;
    Flight flight;
    Passenger passenger;
    Ticket.Status status;
    Address hotel;
    ArrayList<String> locations = new ArrayList<>();
    TouristTicket(String pnrNumber, String departureLocation, String destination, Flight flight, Passenger passenger, Ticket.Status status, Address hotel, ArrayList<String> locations){
        this.pnrNumber = pnrNumber;
        this.departureLocation=departureLocation;
        this.destination =destination;
        this.flight = flight;
        this.passenger = passenger;
        this.status = status;
        this.hotel = hotel;
        this.locations = locations;
    }

    public void cancelTicket(){
        this.status =Ticket.Status.CANCELLED;
    }
    public Ticket.Status showStatus(){
        return this.status;
    }

    public Ticket.Status getStatus() {
        return status;
    }
    public void addTouristLocation(String s){
        locations.add(s);
    }
    public void removeTouristLocation(String s){
        locations.remove(s);
    }
    public void printDetails(){
        System.out.println("PNR NUMBER : " + this.pnrNumber);
        System.out.println("Departure : " + this.departureLocation);
        System.out.println("Destination : " + this.destination);
        System.out.println("Flight Number: " + flight.getFlightNumber());
        System.out.println("Ticket Status: " + getStatus());
        System.out.println("Hotel Address : " );
        hotel.printAddress();
        System.out.println("Locations to travel as a tourists " + locations);
        System.out.println("Passenger Details: ");
        passenger.printDetails();
    }
}
