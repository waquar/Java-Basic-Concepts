//datatypes are : String, Int, Float, Character, Boolean
//<datatype> <variablename> = <value>
/*
data types:   primitive: byte(1byte), short(2 bytes), int(4bytes), long(8bytes), float(4 bytes), double(8 bytes)
               booloean(1 bit), char(2 bytes). They are already defined.

               non primitive or reference data type: programmers makes custom

 */
package com.harry;

public class Variables {

    public static  void main(String[] args){
        String name = "Waquar";
        System.out.println(name);
        int a = 46;
        int c = 32, d = 43, f = 56;
        float b = 34.21f;                       //f to include in floating points
        System.out.println(a);
        System.out.println(b);
        boolean isboy = true;
        System.out.println(isboy);
        System.out.println(c);
        byte u = -56;
        System.out.println(u);
        double g = 67.4567d;
        System.out.println(g);
        char grade = 'A';                        //written in single quote if putted double quote it pretends as string.
        System.out.println(grade);
        String w = "waquar";
        System.out.println(w);

    }
}



