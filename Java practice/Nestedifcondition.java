package com.Decisionstatements;
public class Nestedifcondition {
    public static void main(String[] args) {
        String examStatus = "pass";
        if (examStatus == "pass") {
            System.out.println("please wait for next round");
            String round1Status =  "pass";
            if (round1Status == ("pass")) {
                System.out.println("cleared round1, please wait for round2");
                String round2Status =  "pass";
                if (round2Status == ("fail")) {
                    System.out.println("cleared round2, please wait for HR round");
                } else {
                    System.out.println("go to home");
                }
            } else{
                System.out.println("go to home");
            }

        } else {
            System.out.println("go to home");
        }
    }
}
