package com.epam.rd.autotasks.figures;

class Quadrilateral extends Figure{

    Point a,b,c,d;

    public Quadrilateral(Point a, Point b, Point c, Point d) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }

    @Override
    public double area() {
        /*double side1 = Math.sqrt(Math.pow((b.getX() - a.getX()), 2) + Math.pow(b.getY() - a.getY(), 2));
        double side2 = Math.sqrt(Math.pow((c.getX() - b.getX()), 2) + Math.pow(c.getY() - b.getY(), 2));
        double side3 = Math.sqrt(Math.pow((d.getX() - c.getX()), 2) + Math.pow(d.getY() - c.getY(), 2));
        double side4 = Math.sqrt(Math.pow((a.getX() - d.getX()), 2) + Math.pow(a.getY() - d.getY(), 2));
        double diagonal1 = Math.sqrt(Math.pow((c.getX() - a.getX()), 2) + Math.pow(c.getY() - a.getY(), 2));
        double diagonal2 = Math.sqrt(Math.pow(d.getX() - b.getX(), 2) + Math.pow(d.getY() - b.getY(), 2));
        double s = (side1 + side2 + side3 + side4) / 2;
        double area =  Math.sqrt((s - side1) * (s - side2) * (s - side3) * (s - side4) -
                (0.25 * (diagonal1 + diagonal2) * (diagonal1 + diagonal2)));*/
       // return area;
        double side1 = Math.sqrt(Math.pow(b.getX() - a.getX(), 2) + Math.pow(b.getY() - a.getY(), 2));
        double side2 = Math.sqrt(Math.pow(c.getX() - b.getX(), 2) + Math.pow(c.getY() - b.getY(), 2));
        double side3 = Math.sqrt(Math.pow(d.getX() - c.getX(), 2) + Math.pow(d.getY() - c.getY(), 2));
        double side4 = Math.sqrt(Math.pow(a.getX() - d.getX(), 2) + Math.pow(a.getY() - d.getY(), 2));
        double diagonal1 = Math.sqrt(Math.pow(c.getX() - a.getX(), 2) + Math.pow(c.getY() - a.getY(), 2));
        double diagonal2 = Math.sqrt(Math.pow(d.getX() - b.getX(), 2) + Math.pow(d.getY() - b.getY(), 2));
        double s = (side1 + side2 + side3 + side4) / 2;
        double area = Math.sqrt(((s - side1) * (s - side2) * (s - side3) * (s - side4)) -
                (((side1 * side3) + (side2 * side4) + (diagonal1 * diagonal2)) * 0.25 * (((side1 * side3) + (side2 * side4)) - (diagonal1 * diagonal2))));
        return area;
    }

    @Override
    public String pointsToString() {
        return "(" + a +
                ")(" + b +
                ")(" + c +
                ")(" + d + ')';
    }

    @Override
    public Point leftmostPoint() {
        Point leftmost = this.a;
        if (this.b.getX()< leftmost.getX()){
            leftmost = this.b;
        }
        if (this.c.getX()<leftmost.getX()){
            leftmost = this.c;
        }
        if (this.d.getX()<leftmost.getX()){
            leftmost = this.d;
        }

        return leftmost;
    }
}
