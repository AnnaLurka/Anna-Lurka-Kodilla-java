package com.kodilla.testing.shape;

public class Circle implements Shape {

    double r;

    public String getShapeName() {
        return "circle";
    }

    public double getField() {
        return 3.14 * r * r;
    }

}
