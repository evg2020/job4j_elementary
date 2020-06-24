package ru.job4j.loop;

import org.junit.Test;

import static org.junit.Assert.*;
import static org.hamcrest.Matchers.is;

public class PrimeNamberTest {

    @Test
    public void when5() {
        int count = PrimeNamber.calc(5);
        assertThat(count, is(3));
    }
    @Test
    public void when100() {
        int count = PrimeNamber.calc(100);
        assertThat(count, is(138));
    }
    @Test
    public void when11() {
        int count = PrimeNamber.calc(11);
        assertThat(count, is(5));
    }
    @Test
    public void when2() {
        int count = PrimeNamber.calc(2);
        assertThat(count, is(1));
    }
}