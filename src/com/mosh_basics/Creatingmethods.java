package com.mosh_basics;

public class Creatingmethods {
    public static void main(String[] args){
        greetings("waquar","alam");
        int b = add(5,7);
        System.out.println(b);
    }
    public static void greetings(String fname, String lname){
        System.out.println("Hello "+ "" + fname.toUpperCase()+" "+lname);
    }
    public static int add(int num1,int num2){
        return num1+num2;}

}

