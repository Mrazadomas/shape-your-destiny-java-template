package org.example;
import java.lang.Math;

public class Circle extends Shape{
    
    private double r;

    public Circle(double r) {
        this.r = r;
    }

    public double getArea() {
        return Math.PI * Math.pow(r, 2);
    }

    public double getPerimeter() {
        return 2 * Math.PI * r;
    }
}
