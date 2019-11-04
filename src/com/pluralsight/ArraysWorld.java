package com.pluralsight;

import java.util.Formatter;

public class ArraysWorld {
    public static void main(String[] args){
        float[] val = new float[3];
        val[0] = 20.3f;
        val[1] = 30.3f;
        val[2] = 50.3f;
        int sum = 0;

//        for (int i = 0; i < val.length; i++){
//            sum += val[i];
//        }

        //for each loop
        for(float item: val) {
            sum += item;
            System.out.println(item);
        }
        System.out.println(sum);
    }


}
