package com.company;
abstract class shape{
    protected String color;
    protected boolean filled;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    public abstract double getArea();

    public abstract double getPerimeter();

    public String toString() {
        return "shape{" +
                "color='" + color + '\'' +
                ", filled=" + filled +
                '}';
    }
}
public class Main {

    public static void main(String[] args) {
        Circle n1=new Circle(15);
        System.out.println(n1.getArea()+"  "+n1.getPerimeter());
        Rectangle n2=new Rectangle(5,2);
        System.out.println(n2.getArea()+"  "+n2.getPerimeter());
        System.out.println(n2.getWidth()+"  "+n2.getLength());
    }
}
