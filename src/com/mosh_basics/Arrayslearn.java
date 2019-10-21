package com.mosh_basics;

import java.util.Arrays;

public class Arrayslearn {
    public static  void main(String[] args){
        //if we are unsure of our array members
        int[] numbers = new int[7];
        numbers[0] = 2;
        numbers [3] = 5;
        numbers[1] = 8;
        Arrays.sort(numbers);
        System.out.println(Arrays.toString(numbers));

        //if we are sure about memebers
        int[] number1 = {2,3,5,6,2,6,8,9,0};
        System.out.println(number1.length);
        System.out.println();

    }
}
// in java arrays are fixed length. we cant add more.