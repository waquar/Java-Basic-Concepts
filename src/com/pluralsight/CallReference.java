package com.pluralsight;

public class CallReference {
    public int passenger = 150;
    public int seat;
    public static void main(String[] args){
        CallReference c1 = new CallReference();
        CallReference c2 = new CallReference();
        System.out.println(c1.equals(c2));
        System.out.println("Empty seats are : " + c1.details(180));
        c2 = c1;
        System.out.println(c1.equals(c2));
    }
    public int details(int a){
        this.seat = a;
        return seat-passenger;
    }

}
