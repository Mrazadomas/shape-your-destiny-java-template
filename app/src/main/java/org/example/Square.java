package org.example;

public class Square extends Rectangle {
    
    private double s;

    public Square(double s) {
        this.s = s;
    }
 
    public double getArea() {
        return s * s;
    }
    
    public double getPerimeter() {
        return 4 * s;
    }

    public int numberOfSides() {
        return 4;
    }
}
