package flight.reservation.System;

public class Flight {
    private String flightNumber;
    private int capacity;
    private int numOfSeatBooked;
    private int vacantSeats;
    Flight(String flightNumber,int capacity,int numOfSeatBooked,int vacantSeats){
        this.flightNumber = flightNumber;
        this.capacity = capacity;
        this.numOfSeatBooked = numOfSeatBooked;
        this.vacantSeats = vacantSeats;
    }

    public String getFlightNumber() {

        return flightNumber;}

    public int getCapacity() {
        return capacity;
    }

    public int getNumOfSeatBooked() {
        return numOfSeatBooked;
    }

    public int getVacantSeats() {
        return vacantSeats;
    }
}
