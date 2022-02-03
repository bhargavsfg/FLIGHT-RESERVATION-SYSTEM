package flight.reservation.System;

public class Flight {
    String flightNumber;
    int capacity;
    int numOfSeatBooked;
    int vacantSeats;
    Flight(String flightNumber,int capacity,int numOfSeatBooked,int vacantSeats){
        this.flightNumber = flightNumber;
        this.capacity = capacity;
        this.numOfSeatBooked = numOfSeatBooked;
        this.vacantSeats = vacantSeats;
    }

    public String getFlightNumber() {
        return flightNumber;
    }
}
