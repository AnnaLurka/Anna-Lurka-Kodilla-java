package com.kodilla.patterns.factory.tasks;

public final class TaskFactory {

    public static final String SHOPPING = "Shopping";
    public static final String PAINTING = "Painting";
    public static final String DRIVING = "Driving";

    public final Task makeTasks(final String taskClass) {
        switch (taskClass) {
            case SHOPPING:
                return new ShoppingTask("foodShopping", "apples", 2.0);
            case PAINTING:
               return new PaintingTask("housePainting", "blue", "bedroom");
            case DRIVING:
                return new DrivingTask("cityDriving", "supermarket", "car");
            default:
                return null;
        }
    }
}
