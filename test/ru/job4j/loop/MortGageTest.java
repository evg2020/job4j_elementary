package ru.job4j.loop;

import org.junit.Test;

import static org.junit.Assert.*;
import static org.hamcrest.Matchers.is;

public class MortGageTest {

    @Test
    public void when1Years() {
        int years = MortGage.years(1000, 1200, 1);
        assertThat(years, is(1));
    }
    @Test
    public void when2Years(){
        int years = MortGage.years(100, 120, 50);
        assertThat(years, is(2));
    }
}