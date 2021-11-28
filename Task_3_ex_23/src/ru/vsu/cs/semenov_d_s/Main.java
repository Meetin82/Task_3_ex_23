package ru.vsu.cs.semenov_d_s;

import ru.vsu.cs.semenov_d_s.Figures.Line;
import ru.vsu.cs.semenov_d_s.Figures.Rectangle;
import ru.vsu.cs.semenov_d_s.Figures.VerticalParabola;

import java.awt.geom.Point2D;
import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Locale.setDefault(Locale.ROOT);

        Picture picture = new Picture(new VerticalParabola(0, -6, 0.25),
                new Rectangle(new Point2D.Double(-6, -2), new Point2D.Double(-1, 4)),
                new Line(-1, 2, -2));

        Test test = new Test();

        if (test.makeTest(picture)) {
            System.out.println("The program works correctly.");
        } else {
            System.out.println("Error. The program does not works correctly.");
            return;
        }

        double x = readNumber("X: ");
        if (isNumPositive(x)){
            System.out.println("The entered number does not match the condition (enter -10 <= x <= 10).");
            return;
        }

        double y = readNumber("Y: ");
        if (isNumPositive(y)){
            System.out.println("The entered number does not match the condition (enter -10 <= y <= 10).");
            return;
        }

        printColor(x, y, picture);
    }

    private static double readNumber(String value) {
        System.out.print("Input " + value);
        Scanner scn = new Scanner(System.in);
        return scn.nextDouble();
    }

    private static void printColor(double x, double y, Picture picture) {
        System.out.printf("(%.2f, %.2f) -> ", x, y);
        System.out.println(picture.getColor(x, y));
    }

    private static boolean isNumPositive(double num) {
        return num <= -10 || num >= 10;
    }
}
