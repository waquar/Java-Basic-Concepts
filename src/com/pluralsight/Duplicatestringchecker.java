package com.pluralsight;

import java.util.HashMap;

public class Duplicatestringchecker {
    static void findduplicate(String word){
        HashMap<String, Integer> hm = new HashMap<>();
        String[] s = word.split(" ");
        for (String tempstring : s){
            if (hm.get(tempstring) != null){
                hm.put(tempstring, hm.get(tempstring)+1);
            }
            else{
                hm.put(tempstring, 1);
            }
        }
        System.out.println(hm);
    }

    public static  void main(String[] args){
        findduplicate("Waquar is is a a good boy and and he he is learning oops oops");
    }

}
