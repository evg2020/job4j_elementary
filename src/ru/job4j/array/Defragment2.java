package ru.job4j.array;

public class Defragment2 {
    public static String rowNull(String[] array) {
        String rowNull = array[1];
        for (int i = 0; i < array.length; i++) {
            if (array[i] == null) {
                rowNull = array[i];
                break;
            }
        }
        return rowNull;
    }
    
    public static int indexNull(String[] array) {
        int res = -1;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == null) {
                res = i;
                break;
            }
        }
        return res;
    }
}
