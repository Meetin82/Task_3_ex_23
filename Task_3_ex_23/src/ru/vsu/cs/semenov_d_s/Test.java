package ru.vsu.cs.semenov_d_s;

public class Test {

    public boolean makeTest(Picture picture) {
        if (picture.getColor(3, 4) != SimpleColor.YELLOW) {
            return false;
        } else if (picture.getColor(0, -2) != SimpleColor.GRAY) {
            return false;
        } else if (picture.getColor(-1.5, 3.5) != SimpleColor.ORANGE) {
            return false;
        } else if (picture.getColor(-4, 5) != SimpleColor.BLUE) {
            return false;
        } else if (picture.getColor(-9, 1) != SimpleColor.BLUE) {
            return false;
        } else if (picture.getColor(8, -3) != SimpleColor.GRAY) {
            return false;
        } else {
            printColorForTest(3, 4, picture);
            printColorForTest(0, -2, picture);
            printColorForTest(-1.5, 3.5, picture);
            printColorForTest(-4, 5, picture);
            printColorForTest(-9, 1, picture);
            printColorForTest(8, -3, picture);
            return true;
        }
    }

    private void printColorForTest(double x, double y, Picture picture) {
        System.out.printf("(%.2f, %.2f) -> ", x, y);
        System.out.println(picture.getColor(x, y));
    }
}
