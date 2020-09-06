package com.company;
public class Circle extends shape {
    protected   double radius;

    public Circle(int i) {
        super();
        this.radius=i;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    public double getArea(){
        return 2*Math.PI*radius;
    }
    public double getPerimeter(){
        return Math.PI*radius*radius;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                '}';
    }
}
