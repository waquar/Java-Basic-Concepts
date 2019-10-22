package com.mosh_basics;

import java.util.Scanner;

public class Whileloopwhile {
    public static  void main(String[] args){
        Scanner scan = new Scanner(System.in);
        String word = "";
        while(! word.equals("quit")){
            System.out.print("Enter word : ");
            word = scan.next().toLowerCase();
            System.out.println("you entered this: "+word);
        }
    }

    }
//in while loop we check condition first, but in do while loop we check condition at last.
// So do while statement runs anyhow first without checking condition.