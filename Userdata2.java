package com.java;
import java.util.Scanner;
public class Userdata2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("what is your name");
        String name = scanner.nextLine();
//        System.out.println("where are you from");
//        String village = scanner.nextLine();
        System.out.println("what is your age");
        byte age = scanner.nextByte();
        System.out.println("what is your phoneNo");
        int phoneNo = scanner.nextInt();
        scanner.nextLine();
        System.out.println("where are you from");
        String village = scanner.nextLine();


        System.out.println("name:" +name);
        System.out.println("phoneNO:" +phoneNo);
        System.out.println("age:" +age);
        System.out.println("village:" +village);


    }

}
