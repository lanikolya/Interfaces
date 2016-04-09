package com.company;


public class Square implements Shape {
    //initialize parameters for square

    @Override
    public void color() {
        System.out.println("I`m red");
    }

    @Override
    public void area() {
        System.out.println("I`m 30 square mm");
    }

    @Override
    public void angle() {
        System.out.println("I have 4 angles");
    }
}
