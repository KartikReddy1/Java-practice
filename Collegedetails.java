package com.java;

import java.util.Scanner;
public class Collegedetails {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("what is your name");
        String name = scanner.nextLine();
        System.out.println("what is your USN");
        String USN = scanner.nextLine();
        System.out.println("what is your phoneNo");
        int phoneNo = scanner.nextInt();
        scanner.nextLine();
        System.out.println("which college are you from");
        String college = scanner.nextLine();

//        System.out.println("\n--- Student Details ---");
        System.out.println("Name: " + name);
        System.out.println("USN: " + USN);
        System.out.println("PhoneNo: " + phoneNo);
        System.out.println("college: " + college);
    }

}

