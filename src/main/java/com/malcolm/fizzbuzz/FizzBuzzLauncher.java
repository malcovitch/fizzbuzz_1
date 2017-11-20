package com.malcolm.fizzbuzz;

public class FizzBuzzLauncher {

    private FizzBuzzProcessor fizzBuzzProcessor = new FizzBuzzProcessor();

    public void go(int lowerLimit, int upperLimit) {
       for (int i = lowerLimit; i <= upperLimit; i++) {
           System.out.println(fizzBuzzProcessor.process(i));
       }
    }

}
