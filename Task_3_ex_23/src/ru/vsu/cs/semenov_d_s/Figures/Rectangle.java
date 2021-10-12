package ru.vsu.cs.semenov_d_s.Figures;

import java.awt.geom.Point2D;

public class Rectangle {
    public Point2D.Double lowerLeftPoint;
    public Point2D.Double upperRightPoint;

    public Rectangle(Point2D.Double lowerLeftPoint, Point2D.Double upperRightPoint) {
        this.lowerLeftPoint = lowerLeftPoint;
        this.upperRightPoint = upperRightPoint;
    }

    public boolean isPointInsideRectangle(double x, double y){
        return (x > lowerLeftPoint.getX() && x < upperRightPoint.getX())
                && (y > lowerLeftPoint.getY() &&  y < upperRightPoint.getY());
    }

}

