package com.OOPSdive;

public class Main {
    public static void main(String[] args){
        Employeewage emp =new Employeewage();
        System.out.println("Default is: " + emp.calculatewage());
        emp.setbasesalary(4200, 110,21);
        System.out.println("after using setter: " + emp.calculatewage());
        emp.setbasesalary(2200, 10,51);
        System.out.println("using getter : "+emp.getbasesalary());
    }


}
