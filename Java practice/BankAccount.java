package com.Methods;

public class BankAccount {
    String name;
    double balance;

    BankAccount(String name, double balance) {
        this.name = name;
        this.balance = balance;
    }

    void display() {
        System.out.println("Account Holder: " + name);
        System.out.println("Balance: " + balance);
    }

    public static void main(String[] args) {
        BankAccount b = new BankAccount("Karthik", 5000);

        b.display();
    }
}