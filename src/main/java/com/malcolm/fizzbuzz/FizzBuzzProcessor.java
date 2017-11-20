package com.malcolm.fizzbuzz;

public class FizzBuzzProcessor {

    public enum FizzBuzzEnum {

        FIZZ(3, "Fizz"),
        BUZZ(5, "Buzz");

        private int divisor;
        private String output;

        FizzBuzzEnum(int divisor, String output) {
            this.divisor = divisor;
            this.output = output;
        }

        public String getOutput() {
            return output;
        }
    }

    public String process(int i) {
        if (i % (FizzBuzzEnum.FIZZ.divisor * FizzBuzzEnum.BUZZ.divisor) == 0) {
            return FizzBuzzEnum.FIZZ.getOutput() + FizzBuzzEnum.BUZZ.output;
        } else if (i % FizzBuzzEnum.FIZZ.divisor == 0) {
            return FizzBuzzEnum.FIZZ.getOutput();
        } else if (i % FizzBuzzEnum.BUZZ.divisor == 0) {
            return FizzBuzzEnum.BUZZ.getOutput();
        }
        return new String() + i;
    }
}
