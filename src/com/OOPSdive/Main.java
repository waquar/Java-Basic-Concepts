package com.OOPSdive;

public class Main {
    public static void main(String[] args){
        Employeewage emp =new Employeewage();
        emp.getbasesalary();
        System.out.println("Default calculation is: " + emp.calculatewage());
        emp.setbasesalary(4200, 110,21);
        System.out.println("after using setter: " + emp.calculatewage());
        emp.setbasesalary(2200, 10,51);

    }

}

