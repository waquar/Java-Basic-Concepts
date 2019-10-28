package com.OOPSdive;

public class UseConstructor {
    private int base_salary;
    private int extra_wage = 20;
    private int hours;
    public UseConstructor(int bases_salary, int hours){
        //setting value using setter
        setbasesalary(bases_salary,hours);
    }
    public UseConstructor(int bases_salary){
        this(bases_salary, 5);
        setbasesalary(bases_salary,hours);

    }

    public int calculatewage(int salary,int hours){
        this.base_salary = salary;
        this.hours = hours;
        return  base_salary + (extra_wage*hours);
    }

    public int calculatewage(){
        return  base_salary;
    }

    public void setbasesalary(int salary,int hours) {
        this.base_salary = salary;
        this.hours = hours;
        System.out.println("code reached here!");

    }
}
