package ru.job4j.loop;

import org.junit.Test;
import org.junit.Assert;

import static org.junit.Assert.*;

public class FactorialTest {

    @Test
    public void whenCalculateFactorialForFiveThenOneHundredTwenty() {
        int i = 1;
        int result = Factorial.calc(5);
        int expected = 120;
        Assert.assertEquals(expected, result);
    }

    @Test
    public void whenCalculateFactorialForZeroThenOne() {
        int i = 0;
        int result = Factorial.calc(1);
        int expected = 1;
        Assert.assertEquals(expected, result);
    }
}