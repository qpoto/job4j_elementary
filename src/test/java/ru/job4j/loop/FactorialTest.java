package ru.job4j.loop;

import org.junit.Assert;
import org.junit.Test;

public class FactorialTest {
    @Test
    public void whenCalculateFactorialForFiveThenOneHundredTwenty() {
        int start = 1;
        int finish = 5;
        int result = Factorial.calc(5);
        int expected = 120;
        Assert.assertEquals(expected, result);
    }

    @Test
    public void whenCalculateFactorialForZeroThenOne() {
        int start = 1;
        int finish = 0;
        int result = Factorial.calc(0);
        int expected = 1;
        Assert.assertEquals(expected, result);
    }
}