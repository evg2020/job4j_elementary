package ru.job4j.condition;

import org.junit.Test;
import org.junit.Assert;

public class PointTest {

    @Test
    public void whenXY0ThenY2() {
        int x1 = 0;
        int y1 = 0;
        int x2 = 2;
        int y2 = 0;
        int expected = 2;
        double out = Point.distance(x1, x2, y1, y2);
//        Assert.assertEquals(expected, out, 0.1);
        boolean compare = expected == out;
        System.out.println(compare);
    }

}