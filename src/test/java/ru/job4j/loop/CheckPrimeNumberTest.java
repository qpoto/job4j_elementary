package ru.job4j.loop;

import org.junit.Assert;
import org.junit.Test;

public class CheckPrimeNumberTest {
    @Test
    public void when5() {
        boolean result = CheckPrimeNumber.check(5);
        Assert.assertTrue(result);
    }

    @Test
    public void when4() {
        boolean result = CheckPrimeNumber.check(4);
                Assert.assertFalse(result);
    }

    @Test
    public void when1() {

        boolean result = CheckPrimeNumber.check(1);
        Assert.assertFalse(result);
    }
}