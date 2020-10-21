package array;

import org.junit.Test;

import static org.junit.Assert.*;
import static org.hamcrest.core.Is.is;

public class SoftSelectedTest {

    @Test
    public void whenSort5() {
        int[] input = new int[] {3, 4, 1, 2, 5};
        int[] result = SoftSelected.soft(input);
        int[] expect = new int[] {1, 2, 3, 4, 5};
        assertThat(result, is(expect));
    }

    @Test
    public void whenSort3() {
        int[] input = new int[] {3, 2, 1};
        int[] result = SoftSelected.soft(input);
        int[] expect = new int[] {1, 2, 3};
        assertThat(result, is(expect));
    }
}