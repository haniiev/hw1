package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("What is your name?");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        System.out.println("Where are you live?, " + name);
        String address = scanner.nextLine();

        System.out.println("Your data is:");
        System.out.println(name);
        System.out.println(address);
    }
}

