package com.kodilla.exception.test;

public class ExceptionHandling {

    public static void main(String arg[]) {

        SecondChallenge secondChallenge = new SecondChallenge();;

        try {
            secondChallenge.probablyIWillThrowException(1.1, 1.2);

        } catch (Exception e) {

            System.out.println("X is more than or equals 2 or is less than 1 or Y equals 1.5." + e);
        }

        finally{
            System.out.println("Finished");
        }
    }
}
