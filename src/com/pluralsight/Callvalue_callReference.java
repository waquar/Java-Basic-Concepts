package com.pluralsight;


//by using object reference call by reference is possible in java.

public class Callvalue_callReference {
    int p;
    int q;

    public static void main(String[] args0){
        Callvalue_callReference c = new Callvalue_callReference();
        int x = 3;
        int y = 4;
        c.testsum(x,y);
        c.p = 10;  //assigning value for global variables
        c.q = 20;   //assigning value for global variables
        c.swap(c);    //passing object reference
        System.out.println(c.p);
        System.out.println(c.q);


    }
    //call by value; just passing copy of input arguments
    public int testsum(int a, int b){
        return a+b;

    }
    public void swap(Callvalue_callReference c1){                      //taking object reference as argument
        int temp;
        temp = c1.p;
        c1.p = c1.q;
        c1.q = temp;


    }
}
