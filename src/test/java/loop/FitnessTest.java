package loop;

import org.junit.Test;
import static org.hamcrest.Matchers.is;

import static org.junit.Assert.*;

public class FitnessTest {

    @Test
    public void whenIvanLessByOneNik() {
        int month = Fitness.calc(90, 95);
        int expected = 1;
        assertThat(month, is(expected));
    }
    @Test
    public void whenIvanLessByFewNik() {
        int month = Fitness.calc(90, 90);
        assertThat(month, is(1));
    }
}