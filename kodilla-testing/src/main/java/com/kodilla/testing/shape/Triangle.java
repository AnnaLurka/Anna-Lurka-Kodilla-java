package com.kodilla.testing.shape;

public class Triangle implements Shape {

    private double a;
    private double h;

    public String getShapeName() {
        return "triangle";
    }

    public double getField() {
        return 0.5 * a * h;
    }
}
