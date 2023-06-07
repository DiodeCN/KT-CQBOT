package org.example;

public class Main {
    public static void main(String[] args) {

        String newline = System.getProperty("line.separator");

        System.out.printf("Hello and welcome!"+newline);

        for (int i = 1; i <= 5; i++) {
            System.out.println("i = " + i);
        }
    }
}