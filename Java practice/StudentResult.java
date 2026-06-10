package com.Decisionstatements;

import java.util.Scanner;

public class StudentResult {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        for (int i = 1; i <= 5; i++) {

            System.out.println("Enter marks: ");
            int marks = sc.nextInt();

            if (marks < 35) {
                System.out.println("student fail");
            } else if (marks < 70) {
                System.out.println("Student secured Third Class");
            } else if (marks <= 85) {
                System.out.println("student in second class");
            } else {
                System.out.println("student in first class");
            }
            System.out.println("Chance " + i + " completed.\n");
        }
        sc.close();
    }
}