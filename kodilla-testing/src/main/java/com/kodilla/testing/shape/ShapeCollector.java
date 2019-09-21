package com.kodilla.testing.shape;

import java.util.ArrayList;

public class ShapeCollector {

    private Shape shape;
    ArrayList<Shape> shapes = new ArrayList<Shape>();

    public ShapeCollector(Shape shape) {
        this.shape = shape;
    }

    public void addFigure(Shape shape){
        //chciałam tu utworzyć nowy shape ale wiem, że do Interfejsu nie używamy operatora new.
        shapes.add(shape);
    }

    public boolean removeFigure(Shape shape){
        boolean result = false;
        if (shapes.contains(shape)){
            shapes.remove(shape);
            result = true;
        }
        return result;
    }

    public  Shape getFigure(int n){
        Shape shape = null;
        if (n >= 0 && n < shapes.size()) {
            shape = shapes.get(n);
        }
        return shape;
    }

    public void showFigures(){
       // ??


    }
    public int getShapesQuantity(){
        return shapes.size();
    }
}
