package com.kodilla.testing.collection;

import java.util.*;

public class OddNumbersExterminator {

    private ArrayList<Integer> numbers;
    private ArrayList<Integer> even;


    public ArrayList<Integer> exterminate(ArrayList<Integer> numbers){

            for(Integer number : numbers) {
                if ((number % 2) == 0) {

                    even.add(number);
                }
            }
        return even;
    }
}
