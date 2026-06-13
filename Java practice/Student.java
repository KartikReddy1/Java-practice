package com.Methods;

public class Student {
    String name;
    int age;

    Student(String n, int a) {
        name = n;
        age = a;
    }

    public static void main(String[] args) {
        Student s1 = new Student("Karthik", 21);
        System.out.println(s1.name);
        System.out.println(s1.age);
    }

}

