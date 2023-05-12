package com.epam.rd.autotasks.figures;

class Triangle extends Figure {
    Point a,b,c;

    public Triangle(Point a, Point b, Point c) {
        if (a==null||b==null||c==null||a.equals(b)||a.equals(c)||b.equals(c)) {
            throw new IllegalArgumentException();
        }
       /* if (((c.getY()-a.getY())*(b.getX()- a.getX())- (c.getX()- a.getX())*(b.getY()-a.getY()))/2 == 0){
            throw new IllegalArgumentException();
        }*/
        else {
            this.a = a;
            this.b = b;
            this.c = c;
        }

    }

    @Override
    public double area(){
        double area = ((c.getY()-a.getY())*(b.getX()- a.getX())- (c.getX()- a.getX())*(b.getY()-a.getY()))/2;
        return Math.abs(area);
    }

    @Override
    public String pointsToString() {
        return "(" + a +
                ")(" + b +
                ")(" + c +
                ')';
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
        return leftmost;
    }


}
