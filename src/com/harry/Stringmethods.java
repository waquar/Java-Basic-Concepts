package com.harry;

public class Stringmethods {
    public static  void main(String[] args){
        String a = "Waquar";
        String b = "is python lover";
        String c = "but now learning Java";
        System.out.println(a + b + "\t" +c);
        System.out.println(a + b + "\n" +c);
        System.out.println(a + b + "\\" +c);      //escape character
        System.out.println(a.contains("waquar"));
        System.out.println(a.charAt(3));
        System.out.println(a.endsWith("ar"));
        System.out.println(a.indexOf("par"));      //gives result of first index/if not found gives -1 as result.

    }
}
