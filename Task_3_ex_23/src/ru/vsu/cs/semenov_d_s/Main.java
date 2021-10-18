package ru.vsu.cs.semenov_d_s;

import java.util.Locale;
import java.util.Scanner;

import static ru.vsu.cs.semenov_d_s.Test.printTest;

public class Main {

    public static void main(String[] args) {

        Locale.setDefault(Locale.ROOT);

        if (test.makeTest()){
            System.out.println("The program works correctly.");
        } else {
            System.out.println("Error. The program does not works correctly.");
            System.exit(1);
        }

        printTest();

        double x = readNumber("X: ");
        checkNumPositive(x);

        double y = readNumber("Y: ");
        checkNumPositive(y);

        printColor(x, y);
    }

    private static final Picture picture = new Picture();
    private static final Test test = new Test();

    private static double readNumber(String value){
        System.out.print("Input " + value);
        Scanner scn = new Scanner(System.in);
        return scn.nextDouble();
    }

    public static void printColor(double x, double y) {
        System.out.printf("(%.2f, %.2f) -> ", x, y);
        System.out.println(picture.getColor(x, y));

        if (x <= 10 && x >= -10 && y <= 10 && y >= -10) {
            System.out.println("Correctly .The numbers range from -10 to 10.");
        } else {
            System.out.println("Error. The numbers are not in the range from -10 to 10.");
        }
    }

    private static void checkNumPositive(double num) {
        if (num <= -10 || num >= 10) {
            System.out.println("The entered number does not match the condition.");
            System.exit(1);
        }
    }

}
