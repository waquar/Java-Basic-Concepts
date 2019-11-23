package com.basics;

public class cheapcar {

    final static int pricecar = 30000;

    public static void main(String[] args){
        price();
        division();

    }

    public static void price(){

        try{
            System.out.println("coming from try block");
            //pricecar = 3000;
        }
        catch (Exception e){
            System.out.println("coming from catch block");
        }
        finally{
            System.out.println("from finally block");
        }

        System.out.println(cheapcar.pricecar);
    }

    static void division(){
        int i = 20;
        try{
            System.out.println();
            int k = i/0;
        }

        //It will throw exception. because coming error is arithmetic and we are giving null pointer
        catch(NullPointerException n){
            System.out.println("from null pointer");
        }
        catch(ArithmeticException e){
            System.out.println("printing this because cant assisgn k value dividing zero");
        }

        //It will called always(no excuse).
        finally{
            int k = i+2;
            System.out.println("coming from finally block. new value of k is>> " + k);

        }

    }

}
