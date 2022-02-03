package flight.reservation.System;

import java.util.ArrayList;

public class Ticket {
    String pnrNumber;
    String departureLocation;
    String destination;
    Flight flight;
    Passenger passenger;
    static enum Status{
        CANCELLED,CONFIRMED
   }


    Status status;

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
}
