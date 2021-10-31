package ru.vsu.cs.semenov_d_s;

import ru.vsu.cs.semenov_d_s.Figures.Line;
import ru.vsu.cs.semenov_d_s.Figures.Rectangle;
import ru.vsu.cs.semenov_d_s.Figures.VerticalParabola;

public class Picture {

    private final VerticalParabola P;
    private final Rectangle R;
    private final Line L;

    public Picture(VerticalParabola p, Rectangle r, Line l) {
        P = p;
        R = r;
        L = l;
    }

    public SimpleColor getColor(double x, double y) {
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

