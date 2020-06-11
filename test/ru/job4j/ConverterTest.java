package ru.job4j;

import org.junit.Assert;
import org.junit.Test;

public class ConverterTest {

    @Test
    public void rubleToEuro() {
        int in = 140;
        int expected = 2;
        float out = Converter.rubleToEuro(in);
        Assert.assertEquals(expected, out);
    }
}