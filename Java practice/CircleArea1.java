package com.Methods;

public class CircleArea1 {
    double radius;

    CircleArea1(double radius) {
        this.radius = radius;
    }

    void area() {
        double area = 3.14 * radius * radius;
        System.out.println("Area = " + area);
    }

    public static void main(String[] args) {
        CircleArea1 c = new CircleArea1(5);
        c.area();
    }
}