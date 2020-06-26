package ru.job4j.array;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.hamcrest.core.Is.is;

public class FindLoopTest {

    @Test
    public void whenArrayHas5Then0() {
        int value = 5;
        int[] input = new int[]{1, 2, 3, 4, 5};
        int res = FindLoop.indexOf(input, value);
        int expect = 4;
        assertThat(res, is(expect));
    }

    @Test
    public void wheArrayHas6Thennothing() {
        int value = 5;
        int[] input = new int[]{1, 2, 3, 4, 5};
        int res = FindLoop.indexOf(input, value);
        int expect = 6;
        assertThat(res, is(expect));
    }

}