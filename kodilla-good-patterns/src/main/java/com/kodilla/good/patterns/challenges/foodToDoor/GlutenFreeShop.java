package com.kodilla.good.patterns.challenges.foodToDoor;

import java.util.Map;

public class GlutenFreeShop implements Supplier {


    public boolean process(Map<Product, Integer> listOfProducts){

        System.out.println("Ordering  from Gluten Free Shop.");

        return true;
    }
}
