package ru.job4j.array;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.hamcrest.Matchers.is;

public class TurnTest {

    @Test
    public void whenBackthenOposite() {
        int[] array = new int[]{1, 2, 3, 4, 5};
        int[] res = Turn.back(array);
        int[] expect = new int[]{5, 4, 3, 2, 1};
        assertThat(res, is(expect));
    }

    @Test
    public void whenBackeventhenOposite() {
        int[] array = new int[]{1, 2, 3, 4, 5, 6};
        int[] res = Turn.back(array);
        int[] expect = new int[]{6, 5, 4, 3, 2, 1};
        assertThat(res, is(expect));
    }
}