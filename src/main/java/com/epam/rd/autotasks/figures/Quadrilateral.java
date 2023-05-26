package com.epam.rd.autotasks.figures;
import java.text.DecimalFormat;

class Quadrilateral extends Figure{
    private Point a;
    private Point b;
    private Point c;
    private Point d;
    public Quadrilateral(Point a, Point b, Point c, Point d) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }
    @Override
    public double area() {
        Triangle triangle1 = new Triangle(a,b,c);
        Triangle triangle2 = new Triangle(a,c,d);
        double area = triangle1.area()+triangle2.area();
        DecimalFormat df = new DecimalFormat("#.0");
        String formattedArea = df.format(area);
        return Double.parseDouble(formattedArea);
    }
    @Override
    public String pointsToString() {
        return a.toString() + b.toString() + c.toString();
    }

    @Override
    public Point leftmostPoint() {
        Point leftMost = a;
        if (b.getX()< leftMost.getX()) {
            leftMost = b;
        }
        if (c.getX() < leftMost.getX()) {
            leftMost = c;
        }
        if (d.getX() < leftMost.getX()) {
            leftMost = d;
        }
        return leftMost;
    }
}