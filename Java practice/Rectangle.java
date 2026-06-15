package com.Methods;
public class Rectangle {
    int length;
    int width;

    Rectangle(int length, int width) {
        this.length = length;
        this.width = width;
    }

    void area() {
        System.out.println("Area = " + (length * width));
    }

    public static void main(String[] args) {
        Rectangle r = new Rectangle(10, 5);

        r.area();
    }
}