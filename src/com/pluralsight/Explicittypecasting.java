package com.pluralsight;

public class Explicittypecasting {
    public static void main(String[] args){
        float floatvalue = 1.0f;
        double doublevalue = 2.3d;
        byte bytevalue = 7;
        short shortvalue = 6;
        long longvalue = 10;

        Short result1= (short)longvalue;    // typecasting to byte
        Short result2  = (short)(floatvalue*doublevalue-bytevalue+shortvalue);
        System.out.println("typecasted success!!");
        System.out.println(result2);

    }
}
