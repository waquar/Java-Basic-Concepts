package com.OOPSdive;

public class Employeewage {
    private int basesalary = 2300;
    private int hourlyrates = 60;
    private int extrahours =2;

    public int calculatewage() {
        return basesalary + (hourlyrates * extrahours);
    }

    public void setbasesalary(int salary,int hourrates,int hoursextra) {
        this.basesalary = salary;
        this.hourlyrates = hourrates;
        this.extrahours = hourrates;
    }
    public int getbasesalary() {
        return basesalary + (hourlyrates * extrahours);
    }

}

