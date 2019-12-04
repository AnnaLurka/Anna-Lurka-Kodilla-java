package com.kodilla.good.patterns.challenges.foodToDoor;


import java.util.Map;

public class ExtraFoodShop implements Supplier {


    public boolean process(Map<Product, Integer> listOfProducts) {

        System.out.println("Ordering from Extra Food Shop.");

        return true;
    }
}
