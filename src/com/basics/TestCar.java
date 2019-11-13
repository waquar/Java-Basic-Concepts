package com.basics;


//whenever child and parent have same method priority will be
//given to the child class method.
public class TestCar {
    public static void main(String[] args){
        Bmw b = new Bmw();
        b.start();  //example of method overriding. same name, same arguments
        b.refuel();
        b.foglamp();
        Car c;
        c = new Car();
        c.start();

        //child class object referred by parents class reference variable
        //Topcasting  it is allowed.  child can fit into parent class reference.
        Car c1 = new Bmw();  //Runtime polymorphism; Dynamic polymorphism
        //only common methods can be access by c1. BMW own methods cant be access by c1
        c1.start();   //will access BMW method
        c1.engine();

        //Downcasting:  degrading  Not Allowed.Run time exception will be given.
        //parent cant fit in child class reference.
        Bmw b1 = (Bmw) new Car();     //willcompile but in runtime exception will be there.


    }

}
