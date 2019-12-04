package com.kodilla.good.patterns.challenges;

public class FurnitureOrderService implements OrderService {

    public boolean order(final User user, final Product product, final int quantity) {

        System.out.println("Ordering a " + product.getProductName() + " for: " + user.getName() + " " + user.getSurname() + '\n' + "Quanity: " + quantity);

        return true;
    }
}
