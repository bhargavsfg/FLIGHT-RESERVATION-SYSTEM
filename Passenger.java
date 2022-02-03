package flight.reservation.System;

public class Passenger {
    String name;
    String emailAddress;
    long phoneNumber;
    String street;
    String city;
    String state;
    Passenger(String name,String emailAddress,long phoneNumber,String street,String city,String state){
        this.name = name;
        this.emailAddress = emailAddress;
        this.phoneNumber = phoneNumber;
        this.street = street;
        this.city = city;
        this.state = state;
    }
    public void printDetails(){
        System.out.println("Name : " + this.name);
        System.out.println("emailAddress : " + this.emailAddress);
        System.out.println("phoneNumber : " + this.phoneNumber);
        System.out.println("Street : " + this.street);
        System.out.println("City : " + this.city);
        System.out.println("state: " + this.state);
    }
}
