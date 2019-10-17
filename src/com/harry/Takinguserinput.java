package com.harry;

import java.util.Scanner;

public class Takinguserinput {
    public static  void main(String[] args) {
        Scanner scan = new Scanner(System.in);     //means we want to take input from keyboard(input.stream)
        System.out.print("Enter input");
        String input = scan.nextLine();
        //String input = scan.next();      next will read words till the whitespace comes
        System.out.println(input);
        System.out.println(input.length());
        System.out.println(input.toLowerCase());
        System.out.println(input.toUpperCase());

    }
}
