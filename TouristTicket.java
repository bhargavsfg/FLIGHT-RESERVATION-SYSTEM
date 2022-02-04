package flight.reservation.System;

import java.util.ArrayList;

public class TouristTicket extends Ticket{
    private Address hotel;
    private ArrayList<String> locations = new ArrayList<>();
    TouristTicket(String pnrNumber, String departureLocation, String destination, Flight flight, Passenger passenger, Ticket.Status status, String ticketName,Address hotel, ArrayList<String> locations){
        super(pnrNumber,departureLocation,destination,flight,passenger,status,ticketName);
        this.hotel = hotel;
        this.locations = locations;
    }


    @Override
    protected void printTicketDetails() {
        System.out.println("PNR NUMBER : " + this.pnrNumber);
        System.out.println("Departure : " + this.departureLocation);
        System.out.println("Destination : " + this.destination);
        System.out.println("Flight Number: " + flight.getFlightNumber());
        System.out.println("Ticket Status: " + getStatus());
        System.out.println("Hotel Address : " );
        hotel.printAddress();
        System.out.println("Locations to travel as a tourists " + locations);
        System.out.println("Passenger Details: ");
        passenger.getPassengerDetails();

    }

    public void cancelTicket(){
        this.status =Ticket.Status.CANCELLED;
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




    public Address getHotel() {
        return hotel;
    }

    public ArrayList<String> getLocations() {
        return locations;
    }
}
