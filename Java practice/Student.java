package com.karthik;

public class Student {


    public static void main(String[] args) {
        Student s = new Student();

        s.name = "Karthik";
        s.age = 20;

        System.out.println(s.name);
        System.out.println(s.age);
    }

    String name;
    int age;
}
