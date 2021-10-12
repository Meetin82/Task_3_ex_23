package ru.vsu.cs.semenov_d_s;

import ru.vsu.cs.semenov_d_s.Figures.Line;
import ru.vsu.cs.semenov_d_s.Figures.Rectangle;
import ru.vsu.cs.semenov_d_s.Figures.VerticalParabola;
import java.awt.geom.Point2D;

public class Picture {

    public static final VerticalParabola P = new VerticalParabola(0, -6, 0.25);
    public static final Rectangle R = new Rectangle(new Point2D.Double(-6, -2), new Point2D.Double(-1, 4));
    public static final Line L = new Line(-1, 2, -2);

    public static SimpleColor getColor(double x, double y){
        if (L.isPointAboveLine(x, y) && P.isPointAboveParabola(x, y) && !R.isPointInsideRectangle(x, y)) {
            return SimpleColor.YELLOW;

        } else if (R.isPointInsideRectangle(x, y) && L.isPointAboveLine(x, y))
            return SimpleColor.ORANGE;

        else if (L.isPointAboveLine(x, y) && !P.isPointAboveParabola(x, y)) {
            return SimpleColor.GRAY;

        } else if (!L.isPointAboveLine(x, y) && y > 4)
            return SimpleColor.BLUE;

        else if (!P.isPointAboveParabola(x, y) && !L.isPointAboveLine(x, y)) {
            return SimpleColor.BLUE;
        } else {
            return SimpleColor.GRAY;
        }
    }
}

