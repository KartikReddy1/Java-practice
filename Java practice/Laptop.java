package com.Methods;

public class Laptop {
    String brand;
    int ram;

    Laptop(String brand, int ram) {
        this.brand = brand;
        this.ram = ram;
    }

    void display() {
        System.out.println("Brand: " + brand);
        System.out.println("RAM: " + ram + " GB");
    }

    public static void main(String[] args) {
        Laptop l = new Laptop("Dell", 16);
        l.display();
    }
}