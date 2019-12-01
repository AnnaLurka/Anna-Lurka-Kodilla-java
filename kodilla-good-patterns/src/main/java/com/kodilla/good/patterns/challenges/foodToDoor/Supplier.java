package com.kodilla.good.patterns.challenges.foodToDoor;

import java.util.Map;

    public interface Supplier {

        public boolean process(Map<Product, Integer> listOfProducts);
}
