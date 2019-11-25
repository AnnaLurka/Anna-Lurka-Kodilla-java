package com.kodilla.good.patterns.challenges.foodToDoor;

public class OrderRequest {


        private Supplier supplier;
        private Product productName;
        private int quantity;

    public OrderRequest(Supplier supplier, Product productName, int quantity) {
        this.supplier = supplier;
        this.productName = productName;
        this.quantity = quantity;
    }

    public Supplier getSupplier() {
        return supplier;
    }

    public Product getProductName() {
        return productName;
    }

    public int getQuantity() {
        return quantity;
    }
}
