package com.mosh_basics;

public class Castingitems {
    public static void main(String[] args){
        //Implicit casting : automatic casting
        //byte>short>int>long >float> double
        short x = 1;
        int y = x+2;
        System.out.println(y);

        double a  = 2.3;
        int b = (int)x+ 2;  //explicit casting; happens only with compatible type.
        System.out.println(b);

        String s = "2";
        //using wrapper class
        int ss = Integer.parseInt(s)+2;
        System.out.println(ss);

        String s1 = "2.3";
        //using wrapper class
        double ss1 = Double.parseDouble(s1)+2;
        System.out.println(ss1);

    }
}
