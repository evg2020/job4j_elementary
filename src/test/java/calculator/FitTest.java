package calculator;

import org.junit.Test;
import org.junit.Assert;

public class FitTest {

    @Test
    public void when100CMThenWeight10005() {
        short n = 187;
        double expected = 100.05;
        double out = Fit.manWeight(n);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when100CMThenWeight88() {
        short n = 187;
        double expected = 88.55;
        double out = Fit.womanWeight(n);
        Assert.assertEquals(expected, out, 0.01);
    }
}