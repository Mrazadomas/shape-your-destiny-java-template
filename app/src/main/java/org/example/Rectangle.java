package org.example;

public class Rectangle extends Shape {
    
    private double l;
    private double w;
    
    public Rectangle(double l, double w) {
        this.l = l;
        this.w = w;
    }

    public double getArea() {
        return l * w;
    }

    public double getPerimeter() {
        return (2 * l) + (2 * w);
    }
}
