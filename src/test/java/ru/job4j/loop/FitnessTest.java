package ru.job4j.loop;

import org.junit.Test;
import org.junit.Assert;

import static org.junit.Assert.*;

public class FitnessTest {

    @Test
    public void whenIvanGreatNik() {
        int ivan = 95;
        int nik = 90;
        int expected = 0;
        int result = Fitness.calc(ivan, nik);
        Assert.assertEquals(expected, result);
    }

    @Test
    public void whenIvanLessByOneNik() {
        int ivan = 90;
        int nik = 95;
        int expected = 1;
        int result = Fitness.calc(ivan, nik);
        Assert.assertEquals(expected, result);
    }

    @Test
    public void whenIvanLessByFewNik() {
        int ivan = 50;
        int nik = 90;
        int expected = 2;
        int result = Fitness.calc(ivan, nik);
        Assert.assertEquals(expected, result);
    }

    @Test
    public void whenIvanEqualsNik() {
        int ivan = 90;
        int nik = 90;
        int expected = 1;
        int result = Fitness.calc(ivan, nik);
        Assert.assertEquals(expected, result);
    }
}