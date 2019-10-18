package com.harry;

import java.util.Scanner;

public class Switchstatement {
    public  static  void  main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("enter age\n");
        int input = scan.nextInt();

        switch(input){
            case 7:
                System.out.println("you are 7 years old");
                break;             //if we will not put break it will print all remaining switch cases.
            case 8:
                System.out.println("you are 8 years old");
                break;
            case 9:
                System.out.println("you are 9 years old");
                break;
            default:
                System.out.println("you are this much old>>>"+ input);
        }

    }
}
