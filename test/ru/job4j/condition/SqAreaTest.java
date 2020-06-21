package ru.job4j.condition;

import org.junit.Test;
import org.junit.Assert;

public class SqAreaTest {

    @Test
    public void square() {
        short p = 5;
        short k = 5;
        double expected = 0.86;
        double s = SqArea.square(p, k);
        Assert.assertEquals(expected, s, 0.05);
    }

}