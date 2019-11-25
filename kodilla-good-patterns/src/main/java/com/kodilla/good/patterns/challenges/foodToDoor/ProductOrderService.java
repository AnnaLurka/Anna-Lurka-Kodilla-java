package com.kodilla.good.patterns.challenges.foodToDoor;

public class ProductOrderService {

        private OrderService orderService;

    public ProductOrderService(OrderService orderService) {
        this.orderService = orderService;
    }

    public OrderDto process (OrderRequest orderRequest){

            boolean isOrdered = orderService.order(orderRequest.getSupplier(), orderRequest.getProductName(),
                    orderRequest.getQuantity());

        if(isOrdered) {
            System.out.println("You have ordered  " + orderRequest.getQuantity() + " " + orderRequest.getProductName() + " at " + orderRequest.getSupplier());

            return new OrderDto(orderRequest.getSupplier(), true);
        } else {
            System.out.println("Order error. ");
        }
            return new OrderDto(orderRequest.getSupplier(), false);
        }
    }
