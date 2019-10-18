package com.harry;

import java.util.Scanner;

public class ifelse {
    public static  void main(String[] args){

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your age!!");
        int input = scan.nextInt();

        if (input < 8){
            System.out.println("you are a kid");
        }
        else if (input < 20 ){
            System.out.println("you are teenager");
        }
        else{
            System.out.println("you are adult");
        }
    }
}
