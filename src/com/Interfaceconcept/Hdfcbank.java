package com.Interfaceconcept;

//if a class implementing an interface it must define all the methods of parent class.


//Is a relationship
public class Hdfcbank implements USbank, Brazilbank{

    //implementing USbank interface
    public void credit(){
        System.out.println("hdfc crediting");
    }

    //implementing USbank interface
    public void debit(){
        System.out.println("hdfc debiting");
    }

    //implementing USbank interface
    public void transfertheMoney(){
        System.out.println("hdfc transfer money");
    }

    public void loandept(){
        System.out.println("HDFC giving loan");
    }
    public void mortgagedept(){
        System.out.println("HDFC giving mortgage loan");
    }

    //acheiving multiple inheritence with interface.
    //but cant do this using extend.
    //implementing brazil interface
    public void mutualfunds(){
        System.out.println("brazil bank mutual funds");
    }



}
