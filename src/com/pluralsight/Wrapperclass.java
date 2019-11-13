package com.pluralsight;

public class Wrapperclass {

    public static void main(String[] args){
        String x = "100";
        System.out.println(x+20);
        int i = Integer.parseInt(x);  //string to integer
        System.out.println(i+20);
        //Integer double character boolean etc wrapper  classes available

        int j = 200;
        System.out.println(j+30);
        String s = String.valueOf(j);  //integer to string
        System.out.println(s+30);
    }

}
