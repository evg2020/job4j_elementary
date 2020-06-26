package ru.job4j.array;

import org.junit.Test;

import static org.junit.Assert.*;
import static org.hamcrest.core.Is.is;

public class CheckTest {

    @Test
    public void whenDataMonoByTrueThenTrue() {
        boolean[] data = {true, true, true, true};
        boolean res = Check.mono(data);
        boolean expect = true;
        assertThat(res, is(expect));
    }

    @Test
    public void  whenMonoByFalseThenFalse() {
        boolean[] data = {true, true, false, true};
        boolean res = Check.mono(data);
        boolean expect = false;
        assertThat(res, is(expect));
    }
}