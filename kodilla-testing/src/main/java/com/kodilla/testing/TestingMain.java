package com.kodilla.testing;

import com.kodilla.testing.calculator.Calculator;
import com.kodilla.testing.user.SimpleUser;

public class TestingMain {
    public static void main(String[] args) {
        SimpleUser simpleUser = new SimpleUser("theForumUser");

        String result = simpleUser.getUsername();

        if(result.equals("theForumUser")) {
            System.out.println("Test Ok.");
        } else {
            System.out.println("Error");
        }


        Calculator calculator = new Calculator(2,3);

        int result1 = calculator.add();

        if(result1 == 5){
            System.out.println("Test Ok.");
        } else {
            System.out.println("Error");
        }

        int result2 = calculator.substract();

        if(result2 == -1){
            System.out.println("Test Ok.");
        } else {
            System.out.println("Error");
        }




    }
}
