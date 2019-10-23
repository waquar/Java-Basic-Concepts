package com.mosh_basics;

import java.text.NumberFormat;
import java.util.Scanner;

public class Mortagecalculator {
    public static  void main(String[] args){
        final int months_year = 12;
        final byte percentage = 100 ;

        Scanner scan = new Scanner(System.in);
        System.out.print("Enter principal amount : ");
        int principal_amount = scan.nextInt();

        System.out.print("Enter Annual Interest rate: ");
        float annual_interestrate = scan.nextFloat();
        float monthlyinterest = annual_interestrate/percentage/months_year;
        System.out.println("mi:...."+monthlyinterest);

        System.out.print("what is the period of loan:  ");
        byte years = scan.nextByte();
        int numberofPayments = years*months_year;
        System.out.println("np:...." + numberofPayments);

        double mortgage = principal_amount*(monthlyinterest*Math.pow(1+monthlyinterest,numberofPayments)
                            /(Math.pow(1+monthlyinterest, numberofPayments)));

        String mortgageformatted = NumberFormat.getCurrencyInstance().format(mortgage);
        System.out.println(mortgageformatted);

    }

}
