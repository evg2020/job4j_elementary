package ru.job4j.array;
//6.6.2. Двухмерный массив. Таблица умножения. [#299125]
import org.junit.Test;

import static org.junit.Assert.*;
import static org.hamcrest.core.Is.is;

public class MatrixTest {

    @Test
    public void when2on2() {
        int[][] table = Matrix.multiple(2);
        int[][] expect = {{1, 2}, {2, 4}};
        assertThat(table, is(expect));
    }
}