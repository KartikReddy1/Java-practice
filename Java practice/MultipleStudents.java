package com.Methods;

public class MultipleStudents {
    String name;
    int age;
    MultipleStudents(String n,int a) {
        name = n;
        age = a;
    }
        public static void main(String [] args){
            Student s1 = new Student("Karthik", 20);
            Student s2 = new Student("Rahul", 21);

            System.out.println(s1.name +" "+s1.age);
            System.out.println(s2.name +" "+s2.age);
    }
}
