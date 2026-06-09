package com.Methods;
import java.util.Scanner;
public class Circlearea {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter radius:");
        double radius = scanner.nextDouble();
        double area = 3.14 * radius * radius;
        System.out.println("Area=" + area);
    }

}
