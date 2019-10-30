package com.OOPSdive;

public class UIControl extends  Employeewage{
    private  boolean isenable = true;
    private String mytext ;

    public UIControl() {
        System.out.println("ui control from constructor");
    }

    public void settext(String text){
        this.mytext = text;
    }

    public void changetext(String text1){
        System.out.println(mytext + text1);
    }

    @Override
    public void getbasesalary(){
        System.out.println(mytext + "hero");
    }


    public void enable(){
        isenable = true;
    }
    public  void disable(){
        isenable = false;
    }

    public boolean Isenable() {
        return isenable;
    }

}
