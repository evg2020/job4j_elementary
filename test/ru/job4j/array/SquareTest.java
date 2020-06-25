package ru.job4j.array;

import org.junit.Test;

import static org.junit.Assert.*;
import static org.hamcrest.core.Is.is;

public class SquareTest {

    @Test
    public void whenBound3Then014() {
        int bound = 3;
        int[] res = Square.calc(bound);
        int[] expect = new int[]{0, 1, 4};
        assertThat(res, is(expect));
    }

    @Test
    public void whenBound5Then014916() {
        int bound = 5;
        int[] array = Square.calc(bound);
        int[] expect = new int[]{0, 1, 4, 9, 16};
        assertThat(array, is(expect));
    }
}