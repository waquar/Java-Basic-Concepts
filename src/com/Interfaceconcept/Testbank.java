package com.Interfaceconcept;

public class Testbank {
    public static void main(String[] args){

        Hdfcbank hdfc = new Hdfcbank();
        hdfc.credit();
        hdfc.mortgagedept();

        //child class object can be refereed by parent class interface
        //but only the common methods(overidden methods).

        USbank us = new Hdfcbank();
        us.credit();

        System.out.println(USbank.minimum_balance);  //interface variable
     //   USbank.minimum_balance = 200;  not allowed .interface variables are final.



    }
}
