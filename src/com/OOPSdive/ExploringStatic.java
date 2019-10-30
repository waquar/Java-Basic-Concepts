package com.OOPSdive;

public class ExploringStatic {
    private int age = 20;
    private int weight = 70;

    //static member
    public static int numstudents;

    public int protein(int age, int weight) {
        return age + (weight * 2);

    }

    public static void totalstudents() {
        System.out.println(ExploringStatic.numstudents);


    }
}
