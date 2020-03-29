package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        System.out.print("R = ");
        BufferedReader reader = new BufferedReader( new InputStreamReader(System.in));
        String numa = reader.readLine();
        int R = Integer.parseInt(numa);
        final double PI = 3.14;

        System.out.println("P = " + 2 * PI * R);
        System.out.println("S = " + (PI * R) * (PI * R));
    }
}
