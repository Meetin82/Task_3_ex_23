package ru.vsu.cs.semenov_d_s;

import ru.vsu.cs.semenov_d_s.Figures.Line;
import ru.vsu.cs.semenov_d_s.Figures.Rectangle;
import ru.vsu.cs.semenov_d_s.Figures.VerticalParabola;

import java.awt.geom.Point2D;

import static ru.vsu.cs.semenov_d_s.Main.printColor;

public class Test {

    VerticalParabola P = new VerticalParabola(0, -6, 0.25);
    Rectangle R = new Rectangle(new Point2D.Double(-6, -2), new Point2D.Double(-1, 4));
    Line L = new Line(-1, 2, -2);

    Picture picture = new Picture(P, R, L);

    public boolean makeTest() {
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
            return true;
        }
    }

    public void printTest() {
        printColor(3, 4);
        printColor(0, -2);
        printColor(-1.5, 3.5);
        printColor(-4, 5);
        printColor(-9, 1);
        printColor(8, -3);
    }

}
