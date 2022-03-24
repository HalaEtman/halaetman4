package com.company;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import static java.lang.Math.round;

public class Main {

    public static void main(String[] args) throws IOException {
        //task 1
        float no1, no2, sum, sub, multiply, quotient;


       BufferedReader hm = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Welcome to my calculator, you can sum, subtract, multiply and divide any two numbers");
        System.out.println("you can Choose your first number");
        no1 = Float.parseFloat(hm.readLine());
        System.out.println("you can Choose your second number");
        no2 = Float.parseFloat(hm.readLine());

        sum = no1 + no2;
        sub = no1 - no2;
        multiply = no1 * no2;
        quotient = no1 / no2;

        System.out.printf("your two numbers is,, the first was " + "%2.2f", no1);
        System.out.printf(" and the second was " + "%2.2f\n", no2);

        System.out.printf("Sum = " + "%2.2f\n", sum);
        System.out.printf("Subtraction = " + "%2.2f\n", sub);
        System.out.printf("multiply = " + "%2.2f\n", multiply);
        System.out.printf("quotient = " + "%2.2f\n\n", quotient);

    }
}
