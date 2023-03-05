package com.zipcodewilmington.scientificcalculator;
import java.util.Scanner;

public class CoreFeatures {

    static double currentState = 0;

    public double getCurrent() {
        return currentState;
    }

    public void clearCurrent() {
        double currentState = 0;
        System.out.println(currentState);
    }

    public double changeNumber(double input) {
        currentState = input;
        return currentState;
    }

    // Arithmetic methods start here

    public static double add(double input1, double input2) {
        currentState = input1 + input2;
        return currentState;
    }

    public static double subtract(double input1, double input2) {
        currentState = input1 - input2;
        return currentState;
    }

    public static double multiply(double input1, double input2) {
        currentState = input1 * input2;
        return currentState;
    }

    public static double divide(double input1, double input2) {
        if (input2 != 0) {
            currentState = input1 / input2;
            return currentState;
        } else {
            System.out.print("You can not divide by Zero, a Black hole has been created");
        }
        return 0;
    }

    public static double square(double input1) {
        currentState = input1 * input1;
        return currentState;
    }
    public static double sqrt(double input1) {
        currentState = Math.sqrt(input1);
        return currentState;
    }
    public static double exponent(double input1, double input2) {
        currentState = Math.pow(input1, input2);
        return currentState;
    }
    public static double inverse(double input1) {
        currentState = 1/input1;
        return currentState;
    }

    public static double invert(double input1) {
        currentState = input1 * (-1);
        return currentState;
    }
    public static void  help() {
        System.out.println("Enter:");
        System.out.println("+ for addition");
        System.out.println("- for subtraction");
        System.out.println("* for multiplication");
        System.out.println("/ for division");
        System.out.println("r for squared");
        System.out.println("t for square root");
        System.out.println("y for the power to");
        System.out.println("u for inverse (1/x)");
        System.out.println("i to flip the sign");

        System.out.println("------------------");
        System.out.println("c to clear");
        System.out.println("Q to quit");
        System.out.println();
    }

    }


