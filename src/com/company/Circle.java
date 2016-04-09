package com.company;


public class Circle implements Shape {
    //initialize parameters for circle

    @Override
    public void color() {
        System.out.println("I`m blue");
    }

    @Override
    public void area() {
        System.out.println("I`m 50 square mm");
    }

    @Override
    public void angle() {
        System.out.println("I have not any angles!!!");
    }
}
