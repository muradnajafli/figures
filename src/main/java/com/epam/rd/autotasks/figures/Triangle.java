package com.epam.rd.autotasks.figures;

class Triangle extends Figure{
    private Point a;
    private Point b;
    private Point c;

    public Triangle(Point a, Point b, Point c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    public double area() {
        double sideAB = distance(a, b);
        double sideBC = distance(b, c);
        double sideAC = distance(a, c);

        double s = (sideAB+sideBC+sideAC) / 2.0; // semiperimeter
        return Math.sqrt(s* (s-sideAB) * (s-sideBC) * (s-sideAC));
    }

    @Override
    public String pointsToString() {
        return "(" + a.toString() + ")" + "(" + b.toString() + ")" + "(" + c.toString() + ")";
    }

    @Override
    public Point leftmostPoint() {
        Point leftMost = a;
        if (b.getX() < leftMost.getX()) {
            leftMost = b;
        }
        if (c.getX() < leftMost.getX()) {
            leftMost = c;
        }
        return leftMost;

    }

    private double distance(Point point1, Point point2) {
        double deltaX = point2.getX() - point1.getY();
        double deltaY = point2.getY() - point1.getX();

        return Math.sqrt(deltaX * deltaX - deltaY * deltaY);
    }
}
