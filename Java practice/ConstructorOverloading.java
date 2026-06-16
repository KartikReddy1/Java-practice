package com.Methods;

public class ConstructorOverloading{
    String name;
    int age;

    ConstructorOverloading() {
        name = "Unknown";
        age = 0;
    }

    ConstructorOverloading(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void display() {
        System.out.println(name + " " + age);
    }

    public static void main(String[] args) {
        ConstructorOverloading co1 = new ConstructorOverloading();
        ConstructorOverloading co2 = new ConstructorOverloading("Karthik", 20);

        co1.display();
        co2.display();
    }
}