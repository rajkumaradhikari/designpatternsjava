package com.creator.session1;

public class Calculator {

    private static Calculator cal=null;
    private double x,y;

    private Calculator(){
        System.out.println("I am institiated");
    }
    public static Calculator getInstance(){
        if (cal== null){
            cal =  new Calculator();
        }
        return cal;
    }

    public double add(double x, double y){
        return x+y;
    }

    public double sub(double x, double y){
        return x-y;
    }

    public void setX(double x){
        this.x = x;
    }

    public void setY(double y){
        this.y = y;
    }

    public double add(){
        return x+y;
    }

    public double sub(){
        return x - y;
    }

}
