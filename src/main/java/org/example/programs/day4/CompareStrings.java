package org.example.programs.day4;

import java.util.Scanner;

public class CompareStrings {

    public static void main(String[] args) {

        String s1, s2;

        Scanner in = new Scanner(System.in);

        System.out.println(" Enter first String: ");

        s1 = in.nextLine();

        System.out.println(" Enter second String: ");

        s2 = in.nextLine();

        System.out.println(s1 + s2);

        if (s1.compareTo(s2) > 0) {
            System.out.println("First string is greater than second");

        } else if (s1.compareTo(s2) < 0) {

            System.out.println(" Second string is greater than second");

        }
        else {

            System.out.println("Both strings are equal");
        }


    }


}
