package com.OOPSdive;

public class Main {
    public static void main(String[] args){
        //Textbox box1 = new Textbox();
        Textbox box1 = new Textbox();
        box1.setText("Box1");
        System.out.println(box1.text.toUpperCase());

        Textbox box2 = new Textbox();
        box2.setText("Box2");
        System.out.println(box2.text.toLowerCase());

    }

}
