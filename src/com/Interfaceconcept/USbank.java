package com.Interfaceconcept;

// there will be no main method in interface
// no need to provide entire method body.
// only method declaration
// in interface we can declare the variable and they are by default static.
// variable value can't be change
// no static methods are allowed in interface
// because its part of oops, and object cant have static methods.
// we cant create object of the interface. abstract in nature.

public interface USbank {

    int minimum_balance = 150;

    public void credit();

    public void debit();

    public void transfertheMoney();


}
