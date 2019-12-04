package com.kodilla.testing.shape;

class Square implements Shape {

    private double a;

    public String getShapeName() {
        return "square";
    }

    public double getField() {
        return a * a;
    }
}
