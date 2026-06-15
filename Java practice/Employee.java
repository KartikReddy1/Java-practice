package com.Methods;

public class Employee {
    int id;
    String name;
    double salary;

    Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    void display() {
        System.out.println(id);
        System.out.println(name);
        System.out.println(salary);
    }

    public static void main(String[] args) {
        Employee e1 = new Employee(101, "Ravi", 45000);

        e1.display();
    }
}