package ru.job4j.array;

import org.junit.Test;
import org.junit.Assert;

import static org.junit.Assert.*;

public class ArrayCharTest {

    @Test
    public void whenStartWithPrefixThenTrue() {
        char[] word = {'H', 'e', 'l', 'l', 'o'};
        char[] pref = {'H', 'e'};
        boolean result = ArrayChar.startsWith(word, pref);
        Assert.assertTrue(result);
    }

    @Test
    public void whenNotStartPrefixThenFalse() {
        char[] word = {'H', 'e', 'l', 'l', 'o'};
        char[] pref = {'H', 'i'};
        boolean result = ArrayChar.startsWith(word, pref);
        Assert.assertFalse(result);
    }
}