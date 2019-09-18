//Jeszcze nieskończone ale sprawdź, proszę, czy idę w dobrym kierunku.

package com.kodilla.testing.collection;

import java.util.*;

public class OddNumbersExterminator {

    private ArrayList<Integer> numbers;
    private ArrayList<Integer> even;

    public OddNumbersExterminator(ArrayList<Integer> numbers, ArrayList<Integer> even ) {
        this.numbers = numbers;
        this.even = even;
    }

    public ArrayList<Integer> exterminate(ArrayList<Integer> numbers){

        while(numbers.size() > 0){

            for(Integer number : numbers) {
                if ((number % 2) == 0) {

                    even.add(number);
                }
            }
        }
        return even;
    }
}
