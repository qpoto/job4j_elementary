package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class MaxTest {
    @Test
    public void whenMax1To2Then2() {
        int left = 1;
        int right = 2;
        int result = Max.max(left, right);
        int expected = 2;
        Assert.assertEquals(result, expected);
    }

    @Test
    public void whenMax2To1Then2() {
        int left = 2;
        int right = 1;
        int result = Max.max(left, right);
        int expected = 2;
        Assert.assertEquals(result, expected);
    }

    @Test
    public void whenMax2To2Then2() {
        int left = 2;
        int right = 2;
        int result = Max.max(left, right);
        int expected = 2;
        Assert.assertEquals(result, expected);
    }

    @Test
    public void whenMax3To1To2To3Then3() {
        int left = 1;
        int right = 2;
        int upper = 3;
        int result = Max.max(left, right, upper);
        int expected = 3;
        Assert.assertEquals(result, expected);
    }

    @Test
    public void whenMax4To1To2To3To4Then3() {
        int left = 1;
        int right = 2;
        int upper = 3;
        int lower = 4;
        int result = Max.max(left, right, upper, lower);
        int expected = 4;
        Assert.assertEquals(result, expected);
    }
}