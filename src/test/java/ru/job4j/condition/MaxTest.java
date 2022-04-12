package ru.job4j.condition;

import org.junit.Test;
import org.junit.Assert;

import static org.junit.Assert.*;

public class MaxTest {

    @Test
    public void whenMax1To2Then2() {
        int left = 1;
        int right = 2;
        int result = Max.max(left, right);
        int expected = 2;
        Assert.assertEquals(expected, result);

    }

    @Test
    public void whenMax8To9Then9() {
        int left = 8;
        int right = 9;
        int result = Max.max(left, right);
        int expected = 9;
        Assert.assertEquals(expected, result);
    }

    @Test
    public void whenMax6To5Then6() {
        int left = 6;
        int right = 5;
        int result = Max.max(left, right);
        int expected = 6;
        Assert.assertEquals(expected, result);
    }

    @Test
    public void whenMax7To7Then7() {
        int left = 7;
        int right = 7;
        int result = Max.max(left, right);
        int expected = 7;
        Assert.assertEquals(expected, result);
    }
}