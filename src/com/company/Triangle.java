package com.company;


public class Triangle implements Shape {
    //initialize parameters for triangle

    @Override
    public void color() {
        System.out.println("I`m green");
    }

    @Override
    public void area() {
        System.out.println("I`m 40 area mm");
    }

    @Override
    public void angle() {
        System.out.println("I have 3 angles");
    }
}
