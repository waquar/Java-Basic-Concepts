package com.pluralsight;

public class Stringconcatination {
    public static void main(String[] args){
        String fname = "WaquarAlam";
        String lname = "Ansari";
        for (int i = fname.length()-1 ; i>=0 ; i--){
            System.out.print(fname.charAt(i));

        }
        System.out.print("\n");
        System.out.println(fname.concat(lname));
        System.out.println(fname.substring(0,8)+lname.substring(0,2)+
                fname.substring(3));
    }
}
