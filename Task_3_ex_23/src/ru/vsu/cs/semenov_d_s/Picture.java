package ru.vsu.cs.semenov_d_s;

import ru.vsu.cs.semenov_d_s.Figures.Line;
import ru.vsu.cs.semenov_d_s.Figures.Rectangle;
import ru.vsu.cs.semenov_d_s.Figures.VerticalParabola;

public class Picture {
    private final VerticalParabola verticalParabola;
    private final Rectangle rectangle;
    private final Line line;

    public Picture(VerticalParabola parabola, Rectangle rectangle, Line line) {
        this.verticalParabola = parabola;
        this.rectangle = rectangle;
        this.line = line;
    }

    public SimpleColor getColor(double x, double y) {
        if (line.isPointAboveLine(x, y) && verticalParabola.isPointAboveParabola(x, y) && !rectangle.isPointInsideRectangle(x, y)) {
            return SimpleColor.YELLOW;
        } else if (rectangle.isPointInsideRectangle(x, y) && line.isPointAboveLine(x, y)) {
            return SimpleColor.ORANGE;
        } else if (line.isPointAboveLine(x, y) && !verticalParabola.isPointAboveParabola(x, y)) {
            return SimpleColor.GRAY;
        } else if (!line.isPointAboveLine(x, y) && y > 4) {
            return SimpleColor.BLUE;
        } else if (!verticalParabola.isPointAboveParabola(x, y) && !line.isPointAboveLine(x, y)) {
            return SimpleColor.BLUE;
        } else {
            return SimpleColor.GRAY;
        }
    }
}

