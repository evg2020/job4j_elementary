package ru.job4j.condition;

import org.junit.Test;
import org.junit.Assert;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

    public class MaxTest {

    @Test
    public void  whenMax1To2Then2() {
        int res = Max.max(2, 3);
        assertThat(res, is(3));
    }

    @Test
    public void  whenMax2To1Then1() {
        int res = Max.max(3, 2);
        assertThat(res, is(3));
    }

    @Test
    public void  whenMax1To1Then1() {
        int res = Max.max(3, 3);
        assertThat(res, is(3));
    }
}