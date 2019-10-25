package com.mosh_basics;

import java.text.NumberFormat;
import java.util.Scanner;

public class MortagaeCalculator_Enhanced1 {
    final int months_year = 12;
    final byte percentage = 100;

    public static void main(String[] args) {
        int principal_amount = (int) readNumber("Principal: ", 1000, 1_000_000);
        float annualInterest = (float) readNumber("Annual Interest Rate: ", 1, 30);
        byte years = (byte) readNumber("Period (Years): ", 1, 30);
        int numberofPayments = years * months_year;



        double mortgage = principal_amount * (monthlyinterest * Math.pow(1 + monthlyinterest, numberofPayments)
                / (Math.pow(1 + monthlyinterest, numberofPayments)));

        String mortgageformatted = NumberFormat.getCurrencyInstance().format(mortgage);
        System.out.println(mortgageformatted);

    }

    public static double readNumber(String prompt, double min, double max) {
        Scanner scanner = new Scanner(System.in);
        double value;
        while (true) {
            System.out.print(prompt);
            value = scanner.nextFloat();
            if (value >= min && value <= max)
                break;
            System.out.println("Enter a value between " + min + " and " + max);
        }
        return value;
    }


}





