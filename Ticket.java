package flight.reservation.System;

import java.util.ArrayList;

public class Ticket {
    private String pnrNumber;
    private String departureLocation;
    private  String destination;
    private  Flight flight;
    private Passenger passenger;
    static enum Status{
        CANCELLED,CONFIRMED
   }


    private Status status;

    public void cancelTicket(){
        this.status = Status.CANCELLED;
    }
    Ticket(String pnrNumber,String departureLocation,String destination,Flight flight,Passenger passenger,Status status){
        this.pnrNumber = pnrNumber;
        this.departureLocation=departureLocation;
        this.destination =destination;
        this.flight = flight;
        this.passenger = passenger;
        this.status = status;
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

}
