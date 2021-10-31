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

        Test test = new Test();

        if (test.makeTest()) {
            System.out.println("The program works correctly.");
        } else {
            System.out.println("Error. The program does not works correctly.");
            return;
        }

        test.printTest();

        double x = readNumber("X: ");
        checkNumPositive(x);

        double y = readNumber("Y: ");
        checkNumPositive(y);

        printColor(x, y);
    }

    private static double readNumber(String value) {
        System.out.print("Input " + value);
        Scanner scn = new Scanner(System.in);
        return scn.nextDouble();
    }

    public static void printColor(double x, double y) {

        VerticalParabola P = new VerticalParabola(0, -6, 0.25);
        Rectangle R = new Rectangle(new Point2D.Double(-6, -2), new Point2D.Double(-1, 4));
        Line L = new Line(-1, 2, -2);

        Picture picture = new Picture(P, R, L);

        System.out.printf("(%.2f, %.2f) -> ", x, y);
        System.out.println(picture.getColor(x, y));

        if (x <= 10 && x >= -10 && y <= 10 && y >= -10) {
            System.out.println("The numbers range from -10 to 10.");
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
