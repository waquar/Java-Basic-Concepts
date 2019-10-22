package com.mosh_basics;

public class Logicaloperations {
    public static void main(String[] args){
        boolean highincome = true;
        boolean goodcredit = false;
        boolean crimerecord = true;

        boolean eligibility = (highincome || goodcredit) && !crimerecord;  //not operartor used
        System.out.println(eligibility);



    }
}
