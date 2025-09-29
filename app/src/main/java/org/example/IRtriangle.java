package org.example;
import java.lang.Math;

public class IRtriangle extends Rtriangle {
    
    private double s;

    public IRtriangle(double s) {
        this.s = s;
    }

    public double getArea() {
        return (s * s) / 2;
    }

    public double getPerimeter() {
        return s + s + (Math.sqrt(Math.pow(s, 2) + Math.pow(s, 2)));
    }

    public int numberOfSides() {
        return 3;
    }
}
