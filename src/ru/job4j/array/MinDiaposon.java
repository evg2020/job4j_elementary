package ru.job4j.array;
/*6.5.3. Сортировка выборкой. [#299132]*/

public class MinDiaposon {
    public static int findMin(int[] data, int start, int finish) {
        int min = data[start];
        for (int i = start; i <= finish; i++) {
            if (min > data[i]) {
                min =  data[i];
            }
        }

        return min;
    }
}
