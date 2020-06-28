package ru.job4j.array;

import org.junit.Test;

import static org.junit.Assert.*;
import static org.hamcrest.core.Is.is;

public class IsWinTest {

    @Test
    public void whenDataMonoByTrueThenTrue() {
        char[][] data = {
            {' ', ' ', 'X', ' ', ' '},
            {' ', ' ', 'X', ' ', ' '},
            {' ', ' ', 'X', ' ', ' '},
            {' ', ' ', 'X', 'X', ' '},
            {' ', ' ', 'X', ' ', ' '},
        };
        boolean result = IsWin.isWin(data);
        boolean expect = true;
        assertThat(result, is(expect));
    }

    @Test
    public void whenDataNotMonoByTrueThenFalse() {
        char[][] input = {
                {' ', ' ', 'X', ' ', ' '},
                {' ', ' ', 'X', ' ', ' '},
                {' ', 'X', ' ', ' ', ' '},
                {' ', ' ', 'X', ' ', ' '},
                {' ', ' ', 'X', ' ', ' '},
        };
        boolean result = IsWin.isWin(input);
        boolean expect = false;
        assertThat(result, is(expect));
    }

    @Test
    public void whenDataHMonoByTrueThenTrue() {
        char[][] input = {
                {' ', ' ', ' ', ' ', ' '},
                {' ', ' ', ' ', ' ', ' '},
                {'X', 'X', 'X', 'X', 'X'},
                {' ', ' ', 'X', ' ', ' '},
                {' ', ' ', 'X', ' ', ' '},
        };
        boolean result = IsWin.isWin(input);
        boolean expect = true;
        assertThat(result, is(expect));
    }
}