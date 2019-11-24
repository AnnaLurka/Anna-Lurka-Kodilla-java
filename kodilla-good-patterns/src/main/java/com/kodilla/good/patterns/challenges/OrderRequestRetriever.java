package com.kodilla.good.patterns.challenges;

public class OrderRequestRetriever {

    public OrderRequest retrieve(){

        User user = new User("John",  "Smith");
        Product product = new Product("chair", 250.50);
        int quantity = 1;

        return new OrderRequest(user, product, quantity);
    }
}
