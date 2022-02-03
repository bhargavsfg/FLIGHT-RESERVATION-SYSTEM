package flight.reservation.System;

public class Address {
    String street;
    String city;
    String state;
    Address(String street,String city,String state){
        this.street = street;
        this.city = city;
        this.state = state;
    }
    public void printAddress(){
        System.out.println("street : " + street);
        System.out.println("city : " + city);
        System.out.println("state : " + state);
    }

}
