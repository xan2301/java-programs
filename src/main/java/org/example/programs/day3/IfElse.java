package org.example.programs.day3;

import java.util.Scanner;

public class IfElse {

    public static void main(String[] args) {

        int marksObtained, passingMarks;

        passingMarks = 40;

        Scanner in = new Scanner(System.in);

        System.out.println("Input marks scored by you");

        marksObtained = in.nextInt();

        if (marksObtained >= passingMarks) {
            System.out.println("you passed exam");
        } else {

            System.out.println("Unfortunately you failed to pass the exam");
        }
    }


}


