package com.basics;


//finalize is a method.

public class Finalizeconcept {

    public void finalize(){
        System.out.println("from finalize method");
    }

    public static void main(String[] args){
        int a = 20;
        cheapcar c = new cheapcar();
        cheapcar c1 = new cheapcar();

        c = null;
        c1 = null;

        //it will call garbage collector.
        System.gc();
        // but before system.gc finalize method will be called just for cleanup process.

    }



}
