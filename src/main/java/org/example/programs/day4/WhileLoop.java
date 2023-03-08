package org.example.programs.day4;

import java.util.Scanner;

public class WhileLoop {

    public static void main(String[] args) {
        int n;

        Scanner in = new Scanner(System.in);

        System.out.println("Enter integer ");

        while ((n = in.nextInt()) != 0) {

            System.out.println("You Entered " + n);

            System.out.println("Input an Integer");

        }

        System.out.println("Out of loop");


    }

}
