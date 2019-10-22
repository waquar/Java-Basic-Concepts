package com.mosh_basics;

public class Usingforloops {
    public  static  void  main(String[] args){
        String[] fridge = {"aam", "kela", "seb", "doodh", "paani", "bhaalu"};

       for(int i = 0; i < fridge.length; i++){
           System.out.println(fridge[i]);
    }
//for each loop
        for (String items: fridge){
            System.out.println(items);
        }
    }
}
