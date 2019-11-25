package com.kodilla.good.patterns.challenges.foodToDoor;

public class HealthyShop implements OrderService {


        public boolean order(Supplier supplier, Product product, int quantity){

            System.out.println("Ordering " + product.getProductName() +  " from: " + supplier.getName()  + '\n'+  "Quanity: " + quantity);

            return true;
        }
    }
