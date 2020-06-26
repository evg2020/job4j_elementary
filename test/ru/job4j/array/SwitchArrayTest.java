package ru.job4j.array;

import org.junit.Test;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

public class SwitchArrayTest {

    @Test
    public void whenSwap4To5() {
        int[] input = new int[]{1, 2, 3, 4, 5, 6};
        int[] exect = new int[]{1, 2, 3, 4, 6, 5};
        int source = 4;
        int dest = input.length - 1;
        int[] res = SwitchArray.swap(input, source, dest);
        assertThat(res, is(exect));
    }

    @Test
    public void whenswapBorderfistToLast() {
        int[] input = new int[]{1, 2, 3, 4, 5, 6};
        int[] exect = new int[]{6, 2, 3, 4, 5, 1};
        int[] res = SwitchArray.swapBorder(input);
        assertThat(res, is(exect));
    }
}