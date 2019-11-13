package com.pluralsight;

public class Stringprintincrement {
    public static void main(String[] args){
        String s="Automation string Testing ";
        String num = "";
        for (int i =0; i < s.length(); i++){
            System.out.println("current value of num after every iteration is >> " + num);
            num = num + s.charAt(i);
            System.out.println(num);
        }
    }
}
