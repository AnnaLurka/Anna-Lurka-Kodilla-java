package com.kodilla.good.patterns.challenges.foodToDoor;

import java.util.Map;

public class HealthyShop implements Supplier {


        public boolean process(Map<Product, Integer> listOfProducts){

            System.out.println("Ordering  from Healthy Shop.");

            return true;
        }
    }
