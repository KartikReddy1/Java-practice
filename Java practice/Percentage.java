package com.Methods;
import java.util.Scanner;
public class Percentage {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int m1 = sc.nextInt();
        int m2 = sc.nextInt();
        int m3 = sc.nextInt();

        int total = m1+m2+m3;
        double percentage = total/3.0;

        System.out.println("total="+total);
        System.out.println("Percentage=" +percentage);
    }
}
