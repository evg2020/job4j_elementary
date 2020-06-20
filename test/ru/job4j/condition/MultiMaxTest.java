package ru.job4j.condition;

import org.junit.Test;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class MultiMaxTest {

    @Test
    public void maxFrom3Number() {
        int res = MultiMax.multiMax(1, 3, 2);
        assertThat(res, is(3));

    }
}