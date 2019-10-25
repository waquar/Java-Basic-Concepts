package com.mosh_basics;

import java.text.NumberFormat;
import java.util.Scanner;

public class Mortagecalculator {
    public static void main(String[] args) {
        final int months_year = 12;
        final byte percentage = 100;
        int principal_amount = 0;
        float monthlyinterest = 0;
        int numberofPayments = 0;

        Scanner scan = new Scanner(System.in);
        //asking user to fill valid value so wrapping in while loop
        while (true) {
            System.out.print("Enter principal amount : ");
            principal_amount = scan.nextInt();
            if (principal_amount >= 1000 && principal_amount <= 1000000) //except input if user gives bewtween these
                break;
            System.out.println(" Enter value between 1000 and 1000000! ");
        }

        while (true) {
            System.out.print("Enter Annual Interest rate: ");
            float annual_interestrate = scan.nextFloat();
            if (annual_interestrate >= 1 && annual_interestrate <= 35) {
                monthlyinterest = annual_interestrate / percentage / months_year;
                break;
            }
            System.out.println("Enter value between 1 and 35");
        }

        while (true) {
            System.out.print("what is the period of loan:  ");
            byte years = scan.nextByte();
            if (years >= 1 && years <= 25) {
                numberofPayments = years * months_year;
                break;
            }
            System.out.println("Enter year between 1 to 25");
        }

            double mortgage = principal_amount * (monthlyinterest * Math.pow(1 + monthlyinterest, numberofPayments)
                    / (Math.pow(1 + monthlyinterest, numberofPayments)));

            String mortgageformatted = NumberFormat.getCurrencyInstance().format(mortgage);
            System.out.println(mortgageformatted);

        }

    }
