package com.kodilla.good.patterns.challenges.foodToDoor;

public class Application {

    public static void main(String[] args) {

        OrderRequestRetriever orderRequestRetriever = new OrderRequestRetriever();
        OrderRequest orderRequest = orderRequestRetriever.retrieve();

        ProductOrderService productOrderService = new ProductOrderService(new ExtraFoodShop());
        productOrderService.process(orderRequest);
    }
}
