package com.company;

public class Main {

    public static void main(String[] args) {
        //using of interfaces

        Square square = new Square();
        Triangle triangle = new Triangle();
        Circle circle = new Circle();

        System.out.println("Square");

        square.color();
        square.angle();
        square.area();
        System.out.println();

        System.out.println("Triangle");

        triangle.color();
        triangle.angle();
        triangle.area();
        System.out.println();

        System.out.println("Circle");

        circle.color();
        circle.angle();
        circle.area();
    }
}
