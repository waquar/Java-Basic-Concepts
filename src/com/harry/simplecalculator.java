package com.harry;

import java.util.Scanner;

public class simplecalculator {

    public static void main(String[] args){
        System.out.println("Enter two numbers ");
        Scanner scan = new Scanner(System.in);
        float num1 = scan.nextInt();
        Scanner scan1 = new Scanner(System.in);
        float num2 = scan1.nextInt();
        System.out.println("you entered these numbers>>>" +num1 +num2);
        System.out.println("choose: \n 1:add \n 2:subtract \n 3: multiply \n 4: divide");
        Scanner prompt = new Scanner(System.in);
        int command = prompt.nextInt();
        switch(command) {
            case (1):
                System.out.println("Adding these numbers");
                System.out.println(num1 + num2);
                break;
            case (2):
                System.out.println("Subtracting these numbers");
                System.out.println(num1 - num2);
                break;
            case (3):
                System.out.println("Multiplying these numbers");
                System.out.println(num1 * num2);
                break;
            case (4):
                System.out.println("Dividing these numbers");
                System.out.println(num1 / num2);
                break;
            default:
                System.out.println("Invalid input");
        }

    }
}

