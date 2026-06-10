package com.Methods;
import java.util.Scanner;
public class EvenOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        for (int i = 1; i <= 5; i++) {
        System.out.println("Enter number");
        int num = sc.nextInt();

        if(num % 2 == 0 ) {
            System.out.println("given number is even");
        } else{
            System.out.println("given number is odd");
        }
            sc.close();
    }
}
}
