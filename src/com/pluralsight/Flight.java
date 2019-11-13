package com.pluralsight;

//checking method return value!
public class Flight {
    private int passengers;
    private  int seats;

    public boolean hasseats(Flight f2){
        int total = passengers+f2.passengers;
        return  total <= seats;
    }

    public Flight createnewwithboth(Flight f2) {
        Flight newFlight = new Flight();
        newFlight.seats = seats;
        newFlight.passengers = passengers + f2.passengers;
        return newFlight;
    }

    public void displaysomething(){
        System.out.println("yes object created");
    }

    public  static void main(String[] args){
        Flight flight1 = new Flight();
        Flight flight2 = new Flight();
        Flight flight3;

        flight3 = flight1;
        flight3.passengers = 0;


        if (flight1.hasseats(flight2)){
            flight3 = flight1.createnewwithboth(flight2);
            flight3.displaysomething();
            if (flight3 != null){
                System.out.println("not null");
            }
        }

    }

}


