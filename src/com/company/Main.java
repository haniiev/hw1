package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("c1");
        Scanner scanner = new Scanner(System.in);
        String f1 = scanner.nextLine();
        int c1 = Integer.parseInt(f1);
        System.out.println("t1");
        Scanner scanner1 = new Scanner(System.in);
        String r1 = scanner.nextLine();
        int t1 = Integer.parseInt(r1);
        System.out.println("phoneSum: " + c1 * t1);

        System.out.println("c2");
        Scanner scanner2 = new Scanner(System.in);
        String f2 = scanner.nextLine();
        int c2 = Integer.parseInt(f2);
        System.out.println("t2");
        Scanner scanner3 = new Scanner(System.in);
        String r2 = scanner.nextLine();
        int t2 = Integer.parseInt(r2);
        System.out.println("phoneSum: " + c2 * t2);

        System.out.println("c3");
        Scanner scanner4 = new Scanner(System.in);
        String f3 = scanner.nextLine();
        int c3 = Integer.parseInt(f3);
        System.out.println("t3");
        Scanner scanner5 = new Scanner(System.in);
        String r3 = scanner.nextLine();
        int t3 = Integer.parseInt(r3);
        System.out.println("phoneSum: " + c3 * t3);

        System.out.println("totalphoneSum: " + ((c1 * t1) + (c2 * t2) + (c3 * t3)));
    }
}
