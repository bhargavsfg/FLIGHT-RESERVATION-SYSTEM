package flight.reservation.System;


public class RegularTicket extends Ticket {

    private String breakFast;
    private String lunch;
    private String snacks;


    @Override
    protected void printTicketDetails() {
        System.out.println("PNR NUMBER : " + this.pnrNumber);
        System.out.println("Departure : " + this.departureLocation);
        System.out.println("Destination : " + this.destination);
        System.out.println("Flight Number: " + flight.getFlightNumber());
        System.out.println("Ticket Status: " + getStatus());
        System.out.println("Passenger Details: ");
        passenger.getPassengerDetails();
    }

    public void cancelTicket(){
        this.status = Ticket.Status.CANCELLED;
    }
    public void setSpecialServices(String breakFast,String lunch,String snacks){
        this.breakFast = breakFast;
        this.lunch = lunch;
        this.snacks = snacks;
    }
    RegularTicket(String pnrNumber, String departureLocation, String destination, Flight flight, Passenger passenger, Ticket.Status status,String ticketName){
        super(pnrNumber,departureLocation,destination,flight,passenger,status,ticketName);
    }

    public Ticket.Status getStatus() {
        return status;
    }


    public void specialServices(){
        System.out.println("Breakfast : " + this.breakFast);
        System.out.println("Lunch : " + this.lunch);
        System.out.println("Snacks : " + this.snacks);
    }



    public String getLunch() {
        return lunch;
    }

    public String getSnacks() {
        return snacks;
    }

    public String getBreakFast() {
        return breakFast;
    }
}
