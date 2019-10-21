package com.mosh_basics;

import java.text.NumberFormat;

public class Formattingnumbers {
    public static void main(String[] args) {
        //number format is abstract class
        NumberFormat currency = NumberFormat.getCurrencyInstance();
        String result = currency.format(158.35936);
        System.out.println(result);

    }
}
