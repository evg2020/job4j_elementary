package ru.job4j.array;
/**
 * @param data ввод массива.
 * @return result проверка есть ли 1
 *
 * */
public class Check {
    public static boolean mono(boolean[] data) {
        boolean result = true;
        for (int i = 0; i < data.length; i++) {
            if (data[i] != data[0]) {
                result = false;
                break;
            }
        }
        return result;
    }



}
