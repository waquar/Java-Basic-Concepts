package com.harry;

public class breakAndcontinue {
    public static void main(String[] args){
        for (int i = 0; i<= 15 ; i++){
            if (i == 7){
                //break;   break statement is loop breaker
                continue;    // skips that part
            }
            else{
                System.out.println(i);
            }
        }
    }
}
