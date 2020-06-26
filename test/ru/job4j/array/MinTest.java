package ru.job4j.array;

import org.junit.Test;

import static org.junit.Assert.*;
import static org.hamcrest.core.Is.is;

public class MinTest {

    @Test
    public void whenMinSecond() {
        int[] array = {3, 4, 2, 5, 3};
        int res = Min.findMin(array);
        int expect = 2;
        assertThat(res, is(expect));
    }

    @Test
    public void whenMiddleMin() {
        assertThat(Min.findMin(new int[] {10, 2, 5}),is(2));
    }
}