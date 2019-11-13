package com.harry;

public class onjectreference {
    int model;
    int wheels;
    public static void main(String[] args){
        onjectreference a1 = new onjectreference();
        onjectreference a2 = new onjectreference();
        onjectreference a3 = new onjectreference();
        int s1 = a1.add();
        System.out.println(s1);


        a1.model = 2016;
        a1.wheels =4;
        a2.model = 2017;
        a2.wheels =6;
        a3.model = a2.model+1;
        a3.wheels =a2.wheels+2;
//        System.out.println(a3.model);
//        System.out.println(a3.wheels);
        a1.speedometer(4);
        onjectreference.odometer(5);

        }
        public int speedometer(int a) {
            return a * 5;
        }
        static public int odometer(int b){
            return b*5;
        }

        public int add(){
        return 5;
        }

}
