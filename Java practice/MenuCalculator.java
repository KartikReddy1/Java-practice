package com.Decisionstatements;

import java.util.Scanner;

public class MenuCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        for (int i = 1; i <= 5; i++) {

            System.out.println("1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Division");

            System.out.println("Enter your choice:");
            int choice = sc.nextInt();
            System.out.println("Enter first number:");
            double a = sc.nextDouble();
            System.out.println("Enter second number:");
            double b = sc.nextDouble();

            switch (choice) {
                case 1:
                    System.out.println("Result =" + (a + b));
                    break;
                case 2:
                    System.out.println("Result =" + (a - b));
                    break;
                case 3:
                    System.out.println("Result =" + (a * b));
                    break;
                case 4:
                    if (b != 0) {
                        System.out.println("Result = " + (a / b));
                    } else {
                        System.out.println("Division by zero is not allowed");
                    }
                    break;
                default:
                    System.out.println("invalid choice");
            }
        }
        sc.close();
    }
}