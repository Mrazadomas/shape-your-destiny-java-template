package org.example;
import java.lang.Math;

public class Rtriangle extends Shape implements Polygon {
    
    private double l;
    private double w;

    public Rtriangle() {
        l = 0;
        w = 0;
    }
    
    public Rtriangle(double l, double w) {
        this.l = l;
        this.w = w;
    }

    public double getArea() {
        return (l * w) / 2;
    }

    public double getPerimeter() {
        return l + w + (Math.sqrt(Math.pow(l, 2) + Math.pow(w, 2)));
    }

    public int numberOfSides() {
        return 3;
    }
}

