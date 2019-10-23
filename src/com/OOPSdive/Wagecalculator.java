package com.OOPSdive;

public class Wagecalculator {
    public static void main(String[] args){
        int wage = 50000;
        int hours = 12;
        int ratehours = 2000;
        int paycheck = calculatewage(wage, hours, ratehours);
        System.out.println(paycheck);
    }
    public static int calculatewage(int wage, int hours, int ratehours ){
        return  wage + (hours*ratehours);
    }
}
