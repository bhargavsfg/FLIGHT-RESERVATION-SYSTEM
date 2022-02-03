package flight.reservation.System;

import java.util.ArrayList;
import java.util.Random;

public class Implementation {
    enum Status{
        CONFIRMED,CANCELLED;
    }
    public static String generatePNR(){
        Random rand = new Random();
        int pnr = rand.nextInt(100000);
        return String.valueOf(pnr);
    }
    public static void main(String[] args) {

        Flight f1 = new Flight("F1",100,40,60);
        Passenger p1 = new Passenger("Devaki","devaki@gmail.com",1234556780,"Secunderabad","Hyderabad","Telangana");
        Passenger p2 = new Passenger("Roy","roy.ac.in",123456870,"LBNagar","banglore","karnataka");
        RegularTicket ticket = new RegularTicket(generatePNR(),"Mumbai","United States",f1,p2,Ticket.Status.CONFIRMED);
        ticket.cancelTicket();
        System.out.println(ticket.getStatus());
        ticket.printDetails();
        Address hotelAddress = new Address("lane1","NewYork","America");
        ArrayList<String> list = new ArrayList<>();
        list.add("Dallas");
        list.add("chicago");
        list.add("LOsAngels");
        TouristTicket ticket1 = new TouristTicket(generatePNR(),"Mumbai","United States" , f1,p1,Ticket.Status.CONFIRMED,hotelAddress,list);
        System.out.println("----------------------------------------------------------------------------------------------------------------------------------------------------");
        System.out.println("TICKET2");
        ticket1.printDetails();



    }
}
