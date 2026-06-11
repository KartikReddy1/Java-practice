package com.Decisionstatements;

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        for (int i = 1; i <= 5; i++) {
            System.out.println("Enter year");
            int year = sc.nextInt();

            if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
                System.out.println("it is leap year");
            } else {
                System.out.println("it is not leap year");
            }
            System.out.println("chances = " + i + " completed");
        }
        sc.close();
    }
}