package com.mosh_basics;

import java.util.Arrays;

public class MultidimensionalArrays {
    public static  void main(String[] args){
        int[][] numbers = new int[2][4];
        numbers[0][2] = 5;
        System.out.println(Arrays.deepToString(numbers));  //use deep to strings for 2 d

        //curly braces syntax;
        int[][] numbers1 = {{1,2,3},{4,5,6,}};
        System.out.println(Arrays.deepToString(numbers1));

    }

}
