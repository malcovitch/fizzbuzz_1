package com.malcolm.fizzbuzz;

import org.junit.Test;

import static org.junit.Assert.*;

public class FizzBuzzProcessorTest {

    private FizzBuzzProcessor fizzBuzzProcessor =  new FizzBuzzProcessor();

    @Test
    public void process3() throws Exception {
        // Arrange
        int test = 3;
        String expected = FizzBuzzProcessor.FizzBuzzEnum.FIZZ.getOutput();

        // Act
        String actual = fizzBuzzProcessor.process(test);

        // Assert
        assertEquals(expected, actual);
    }

    @Test
    public void process5() throws Exception {
        // Arrange
        int test = 5;
        String expected = FizzBuzzProcessor.FizzBuzzEnum.BUZZ.getOutput();

        // Act
        String actual = fizzBuzzProcessor.process(test);

        // Assert
        assertEquals(expected, actual);
    }

    @Test
    public void process15() throws Exception {
        // Arrange
        int test = 15;
        String expected = FizzBuzzProcessor.FizzBuzzEnum.FIZZ.getOutput() + FizzBuzzProcessor.FizzBuzzEnum.BUZZ.getOutput();

        // Act
        String actual = fizzBuzzProcessor.process(test);

        // Assert
        assertEquals(expected, actual);
    }

    @Test
    public void process30() throws Exception {
        // Arrange
        int test = 30;
        String expected = FizzBuzzProcessor.FizzBuzzEnum.FIZZ.getOutput() + FizzBuzzProcessor.FizzBuzzEnum.BUZZ.getOutput();

        // Act
        String actual = fizzBuzzProcessor.process(test);

        // Assert
        assertEquals(expected, actual);
    }

    @Test
    public void process1() throws Exception {
        // Arrange
        int test = 1;
        String expected = "1";

        // Act
        String actual = fizzBuzzProcessor.process(test);

        // Assert
        assertEquals(expected, actual);
    }

    @Test
    public void process10() throws Exception {
        // Arrange
        int test = 10;
        String expected = FizzBuzzProcessor.FizzBuzzEnum.BUZZ.getOutput();

        // Act
        String actual = fizzBuzzProcessor.process(test);

        // Assert
        assertEquals(expected, actual);
    }

    @Test
    public void process11() throws Exception {
        // Arrange
        int test = 11;
        String expected = "11";

        // Act
        String actual = fizzBuzzProcessor.process(test);

        // Assert
        assertEquals(expected, actual);
    }

}