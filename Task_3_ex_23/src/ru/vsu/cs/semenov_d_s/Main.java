package ru.vsu.cs.semenov_d_s;

import java.util.Locale;
import java.util.Scanner;

import static ru.vsu.cs.semenov_d_s.Picture.getColor;
import static ru.vsu.cs.semenov_d_s.Test.makeTest;

public class Main {

    public static void main(String[] args) {

        Locale.setDefault(Locale.ROOT);

        makeTest();

        double x = readNumber("X: ");
        checkNumPositive(x);

        double y = readNumber("Y: ");
        checkNumPositive(y);

        printColor(x, y);
    }

    private static double readNumber(String value){
        System.out.print("Enter " + value);
        Scanner scn = new Scanner(System.in);
        return scn.nextDouble();
    }

    public static void printColor(double x, double y) {
        System.out.printf("(%.2f, %.2f) -> ", x, y);
        System.out.println(getColor(x, y));

        if (x <= 10 && x >= -10 && y <= 10 && y >= -10) {
            System.out.println("Correctly.");
        } else {
            System.out.println("Error.");
        }
    }

    private static void checkNumPositive(double num) {
        if (num <= -10 || num >= 10) {
            System.out.println("The entered number does not match the condition.");
            System.exit(1);
        }
    }

}
