package com.OOPSdive;

public class Employeewage {
    public int basesalary;
    public int hourlyrates;

    public int calculatewage(int extrahours){
        return basesalary + (hourlyrates*extrahours);
    }


}
