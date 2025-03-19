package com.creator.session1;

public class program {
    public static void main(String[] args) {
        Calculator cal = Calculator.getInstance();
        Calculator cal2 = Calculator.getInstance();

        cal.setX(10);
        cal2.setY(5);

        cal2.setY(10);
        System.out.println(cal.add());

        System.out.println(cal.sub());
    }
}
