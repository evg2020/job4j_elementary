package ru.job4j.array;

import java.time.temporal.IsoFields;

public class Square {
    public static int[] calculation(int bound) {
        int[] result = new int[bound];
        for (int i = 0; i < result.length; i++) {
            result[i] = i * i;
        }
        return result;
    }

    public static void main(String[] args) {
        int[] array = calculation(4);
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);

        }
    }
}

