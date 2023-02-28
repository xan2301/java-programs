package org.example.programs.day2;

import java.util.Scanner;

public class SwapNumbers2 {

    public static void main(String[] args) {

        int x, y;


        System.out.println("Enter x and y");

        Scanner in = new Scanner(System.in);

        x = in.nextInt();
        y = in.nextInt();

        System.out.println(" Before x = " + x + " y = " + y);


        x = x + y;
        y = y * x;


        System.out.println("After  x = " + x + " y = " + y);

    }
}
