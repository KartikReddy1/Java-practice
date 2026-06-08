package com.Decisionstatements;

public class Switchcondition {
    public static void main(String[] args) {
        int i = -2;
        switch (i) {
            case 1:
                System.out.println("first statement");
                break;

            case -2:
                System.out.println("second statement");
                break;
            case 3:
                System.out.println("third statement");
                break;
            default:
                System.out.println("default statement");
                break;

        }
    }
}