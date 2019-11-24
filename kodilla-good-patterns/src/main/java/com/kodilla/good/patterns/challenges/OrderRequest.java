package com.kodilla.good.patterns.challenges;

public class OrderRequest {

    private User user;
    private Product product;
    private int quantity;

    public OrderRequest(User user, Product productName, int quantity) {
        this.user = user;
        this.product = productName;
        this.quantity = quantity;
    }

    public User getUser() {
        return user;
    }

    public Product getProduct() {
        return product;
    }

    public int getQuantity() {
        return quantity;
    }
}
