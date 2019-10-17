/*
operators in java:
operand     operator       operand   result
4               +               7       11
operators in java:
arithmetic operators
assignment operators
assignment operaors
logical operators
comparison operators
 */



package com.harry;

public class operators {
    public static  void main(String[] args){
        int num1 = 45;
        int num2 = 23;

        //arithmetic operators
        System.out.println("value of num1 and num2 is "+ (num1 + num2));
        System.out.println("value of num1 and num2 is "+ (num1 - num2));
        System.out.println("value of num1 and num2 is "+ (num1 * num2));
        System.out.println("value of num1 and num2 is "+ (num1 / num2));
        System.out.println("value of num1 and num2 is "+ (num1 % num2));
        System.out.println("value of num1 and num2 is "+ (num1++));
        System.out.println("value of num1 and num2 is "+ (++num1));
        System.out.println("value of num1 and num2 is "+ (num1--));
        System.out.println("value of num1 and num2 is "+ (--num1));
        System.out.println("value of num1 and num2 is "+ num1+num2);

        //assignment operator
        System.out.println("value of num1 and num2 is "+ (num1+=5));
        System.out.println("value of num1 and num2 is "+ (num1-=5));
        System.out.println("value of num1 and num2 is "+ (num1-=5));
        System.out.println("value of num1 and num2 is "+ (num1*=5));
        System.out.println("value of num1 and num2 is "+ (num1/=5));
        System.out.println("value of num1 and num2 is "+ (num1%=5));
        System.out.println("value of num1 and num2 is "+ (num1));

        //Comparison operators
        /*
           ==  checks for equlity of two values
           !=  checks for nonequlity of two values
           <
           >
           <=
           >=
         */

        //Logical operators

        /*
        && logical and operators :   returns true only if both conditions are true
        || logical or operator  : If any one condition is true
        !   logical not    : Reverse the result to true to false or vice versa
         */


    }
}
