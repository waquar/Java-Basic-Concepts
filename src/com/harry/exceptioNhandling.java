package com.harry;

public class exceptioNhandling {
    public static void main(String[] args){
        String[] cars = {"hero", "honda", "desh", "ki","dharkan"};
        //System.out.println(cars[9]);  //no such index on that array

        try {
            System.out.println(cars[9]);
        }
        catch(Exception e) {
            System.out.println("No such index on that array.");
        }
    }
}
