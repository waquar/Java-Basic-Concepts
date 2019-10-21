package com.mosh_basics;

import java.util.Scanner;

public class InputsUsingScanner {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
//        System.out.print("Age: ");
//        Float age = scan.nextFloat();
//        System.out.println("you are : " + age);
        String name = scan.nextLine();
        System.out.println("your name is: " + name);


    }

}
