package com.mosh_basics;

public class Ternaryoperators {
    public static void main(String[] args){
        int income = 125000;
        //Ternary operators have 3 parts. expression > True > False
        String classname = income > 130000 ? "FirstClass" : "EconomyClass";
        System.out.println("Put this passenger in : " + classname);
    }

}
