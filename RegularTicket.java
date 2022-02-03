package flight.reservation.System;


public class RegularTicket {
    String ticketName;
    String pnrNumber;
    String departureLocation;
    String destination;
    Flight flight;
    Passenger passenger;
    String breakFast;
    String lunch;
    String snacks;
    Ticket.Status status;

    public void cancelTicket(){
        this.status = Ticket.Status.CANCELLED;
    }
    public void setSpecialServices(String breakFast,String lunch,String snacks){
        this.breakFast = breakFast;
        this.lunch = lunch;
        this.snacks = snacks;
    }
    RegularTicket(String pnrNumber, String departureLocation, String destination, Flight flight, Passenger passenger, Ticket.Status status){
        this.pnrNumber = pnrNumber;
        this.departureLocation=departureLocation;
        this.destination =destination;
        this.flight = flight;
        this.passenger = passenger;
        this.status = status;
    }

    public Ticket.Status getStatus() {
        return status;
    }

    public void printDetails(){
        System.out.println("PNR NUMBER : " + this.pnrNumber);
        System.out.println("Departure : " + this.departureLocation);
        System.out.println("Destination : " + this.destination);
        System.out.println("Flight Number: " + flight.getFlightNumber());
        System.out.println("Ticket Status: " + getStatus());
        System.out.println("Passenger Details: ");
        passenger.printDetails();
    }
    public void specialServices(){
        System.out.println("Breakfast : " + this.breakFast);
        System.out.println("Lunch : " + this.lunch);
        System.out.println("Snacks : " + this.snacks);
    }
}
