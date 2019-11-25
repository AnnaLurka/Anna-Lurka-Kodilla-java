package com.kodilla.good.patterns.challenges.foodToDoor;


public class OrderRequestRetriever {

    public OrderRequest retrieve(){

        Supplier supplier = new Supplier("ExtraFoodShop");
        Product product = new Product("strawberries");
        int quantity = 1;

        return new OrderRequest(supplier, product, quantity);
    }
}
