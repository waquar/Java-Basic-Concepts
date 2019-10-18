package com.harry;

public class multidimensionalarray {
    public static void main(String[] args){
        int [][] matrix = {{1,2,3,4},{5,6,7,8}};
        System.out.println(matrix[1][2]);    //[set the array location; 0means 1st block,2 neans 2nd block][value of array]

        int [][][] matrix3= {{{1,2,3,4},{5,6,7,8},{9,10,11,12}}};
        //System.out.println(matrix3[2][0][1]);       to understand

    }
}
