package flight.reservation.System;

import java.util.ArrayList;

public abstract class Ticket {
    protected String ticketName;
    protected String pnrNumber;
    protected String departureLocation;
    protected String destination;
    protected Flight flight;
    protected Passenger passenger;
    enum Status{
        CANCELLED,CONFIRMED
   }
    protected abstract void printTicketDetails();

    protected Status status;

    public void cancelTicket(){
        this.status = Status.CANCELLED;
    }

    Ticket(String pnrNumber,String departureLocation,String destination,Flight flight,Passenger passenger,Status status,String ticketName){
        this.pnrNumber = pnrNumber;
        this.departureLocation=departureLocation;
        this.destination =destination;
        this.flight = flight;
        this.passenger = passenger;
        this.status = status;
        this.ticketName = ticketName;
    }

    public Flight getFlight() {
        return flight;
    }

    public Passenger getPassenger() {
        return passenger;
    }

    public String getDepartureLocation() {
        return departureLocation;
    }

    public String getDestination() {
        return destination;
    }

    public String getPnrNumber() {
        return pnrNumber;
    }

    public Status getStatus() {
        return status;
    }

    public String getTicketName() {
        return ticketName;
    }
}
