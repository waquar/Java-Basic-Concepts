package com.harry;

public class arraysJava {
    public static void main(String[] args){
        int [] marks = {1,2,3,4,5,6,7,8,9,10};
        System.out.println(marks[5]);

        String[] cars = {"hero", "honda", "desh", "ki","dharkan"};
        for(String value:cars){
            System.out.println(value);
        }

        for (int i =0; i<marks.length+1; i++){
            //System.out.println(i);
        }
        for(int value:marks){                                      //one more way
            //System.out.println(value);
        }
    }
}
