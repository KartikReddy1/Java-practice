package com.Decisionstatements;

import java.util.Scanner;
public class VotingEligibility {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        for (int i = 1; i <= 5; i++) {
            System.out.print("Enter age: ");
            int age = sc.nextInt();

            if (age >= 18) {
                System.out.println("Eligible to Vote");
            } else {
                System.out.println("Not Eligible to Vote");
            }

        }
        sc.close();
    }
}