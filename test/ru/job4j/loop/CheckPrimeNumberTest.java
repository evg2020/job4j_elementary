package ru.job4j.loop;

import org.junit.Test;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

public class CheckPrimeNumberTest {

    @Test
    public void when5() {
        boolean res = CheckPrimeNumber.check(5);
        assertThat(res, is(true));

    }

    @Test
    public void when6() {
        boolean res = CheckPrimeNumber.check(6);
        assertThat(res, is(false));

    }
}