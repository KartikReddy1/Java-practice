package com.Methods;

public class ConstructorPractice {
    public int i;

    public static void main(String[] args) {
        ConstructorPractice cp = new ConstructorPractice(50);
        System.out.println(cp.i);

    }
    public ConstructorPractice(){
        i = 20;
        System.out.println("Constructor is called");
    }
    public ConstructorPractice(int a) {
        i = a;
    }
}
