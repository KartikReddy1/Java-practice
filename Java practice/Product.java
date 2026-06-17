package com.Methods;

public class Product {
    int id;
    String name;

    Product(int id, String name) {
        this.id = id;
        this.name = name;
    }

    void display() {
        System.out.println("Product ID: " + id);
        System.out.println("Product Name: " + name);
    }

    public static void main(String[] args) {
        Product p = new Product(101, "Mouse");
        p.display();
    }
}