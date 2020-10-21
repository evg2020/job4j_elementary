package condition;

import org.junit.Test;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class MultiMaxTest {

    @Test
    public void max1From3Number() {
        int res = MultiMax.multiMax(11, 3, 2);
        assertThat(res, is(11));

    }
    public void max2From3Number() {
        int res = MultiMax.multiMax(1, 11, 2);
        assertThat(res, is(11));

    }
    public void equalFrom3Number() {
        int res = MultiMax.multiMax(11, 11, 11);
        assertThat(res, is(11));

    }
}