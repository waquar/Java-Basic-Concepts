package com.harry;

public class statickeyword {
    private String make;
    private int instanceNum = 0;

    public  statickeyword(String make){
        this.make = make;
        instanceNum++;

    }

    public  String getMake(){
        return  make;
    }
}
