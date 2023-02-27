package org.example.programs;

import java.sql.SQLOutput;
import java.util.Scanner;

public class FahrenheitToCelsius {
    public static void main(String[] args) {

        float temperature;
        Scanner in = new Scanner(System.in);

        System.out.println("Enter Temperature in Fahrenheit:");
        temperature = in.nextInt();

        temperature =((temperature - 32)*5)/9;

        System.out.println("Temperature in Celsius = " + temperature);

    }
}
