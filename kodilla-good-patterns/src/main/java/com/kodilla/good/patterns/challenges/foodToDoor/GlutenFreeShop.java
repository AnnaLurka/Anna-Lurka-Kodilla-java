package com.kodilla.good.patterns.challenges.foodToDoor;

public class GlutenFreeShop implements OrderService {

    public boolean order(Supplier supplier, Product product, int quantity){

        System.out.println("Ordering a " + product.getProductName() +  " from: " + supplier.getName()  + '\n'+  "Quanity: " + quantity);

        return true;
    }
}
