package com.Decisionstatements;

import java.util.Scanner;

public class Daycheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        for (int i = 1; i <= 7; i++) {
            System.out.println("enter day");
            String day = sc.nextLine();

            switch (day.toLowerCase()) {
                case "monday":
                case "tuesday":
                case "wednesday":
                case "thusday":
                case "friday":

                    System.out.println("uff, its working day");
                    break;
                case "saturday":
                case "sunday":
                    System.out.println("uff, its holiday");
                    break;

                default:
                    System.out.println("invalied");
            }
            System.out.println("chances " + i + " completed.\n");
        }
        sc.close();
    }
}