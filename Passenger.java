package flight.reservation.System;

public class Passenger {

    private Address address;
    private Contact contact;
    private int id;
    private static int idCounter;


    private static class Address {
        private String street;
        private String city;
        private String state;


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
    private static class Contact  {
        private String name;
        private String emailAddress;
        private long phoneNumber;
        Contact(String name ,String emailAddress,long phoneNumber){
            this.name = name;
            this.emailAddress = emailAddress;
            this.phoneNumber = phoneNumber;
        }
        public  void getContactDetails(){
            System.out.println("Name : " + name);
            System.out.println("email : " + emailAddress);
            System.out.println("PhoneNumber  : " + phoneNumber);
        }

    }


    Passenger(String name,String emailAddress,long phoneNumber,String street,String city,String state){
        this.contact = new Contact(name,emailAddress,phoneNumber);
        this.address = new Address(street,city,state);
        this.idCounter ++;
        this.id = idCounter;
    }

    public void getAddress() {
        address.printAddress();
    }

    public void getContact() {
        contact.getContactDetails();
    }

    public int getId() {
        return id;
    }

    public static int getIdCounter() {
        return idCounter;
    }

    public void getPassengerDetails(){
        this.getAddress();
        this.getContact();
        System.out.println("Id : " + this.getId());
    }
}
