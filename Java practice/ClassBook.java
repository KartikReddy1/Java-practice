package com.Methods;

// Book Details
public class ClassBook {
    String title;
    String author;

    ClassBook(String title, String author) {
        this.title = title;
        this.author = author;
    }

    void display() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
    }

    public static void main(String[] args) {
        ClassBook b = new ClassBook("Java Basics", "James");

        b.display();
    }
}