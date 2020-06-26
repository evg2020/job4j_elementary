package ru.job4j.array;

public class Min {
    public static int findMin(int[] data) {
        int min = data[0];
        for (int i = 0; i < data.length; i++) {
            if (min > data[i]) {
                min =  data[i];
            }
        }
        return min;
    }

    public static void main(String[] args) {
        int[] array = new int[]{12, 3, 4, 34, 18};
        int result = Min.findMin(array);
        System.out.println(result);
    }
}
