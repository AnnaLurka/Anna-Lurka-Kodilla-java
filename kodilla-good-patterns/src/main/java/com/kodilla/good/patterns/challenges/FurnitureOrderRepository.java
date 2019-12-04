package com.kodilla.good.patterns.challenges;

public class FurnitureOrderRepository implements OrderRepository {

    public boolean createOrder(final User user, final Product product, final int quantity) {

        System.out.println("Creating an order of: " + "a " + product.getProductName() + " for: " + user.getName() + " " + user.getSurname() + '\n' + "Quanity: " + quantity);

        return true;
    }
}
