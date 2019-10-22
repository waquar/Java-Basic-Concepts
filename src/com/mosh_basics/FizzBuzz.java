package com.mosh_basics;

import java.util.Scanner;

public class FizzBuzz {
    public static  void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter number :");
        int num = scan.nextInt();

        if (num % 3 == 0 && num % 5 == 0){
            System.out.println("buzzfizz");
        }
        else if (num % 5 == 0){
            System.out.println("fizz");
        }
        else if(num%3==0){
            System.out.println("Buzz");
        }
        else{
            System.out.println(" Not a part of this game");
        }

    }
}
