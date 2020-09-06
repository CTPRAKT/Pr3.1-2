package com.company;

public class Square extends Rectangle {
    public Square(int n, int m) {
        super(n, m);
    }

    public double getSide() {
        return width;
    }


    public void setSide(double side) {
        this.width=side;
    }

    public void setWidth(double side) {
        super.setWidth(side);
    }

    public void setLength(double side) {
        super.setLength(side);
    }

    public String toString() {
        return super.toString();
    }
}

