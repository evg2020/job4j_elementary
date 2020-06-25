package ru.job4j.array;

public class FindLoop {
    public static int indexOf(int[] data, int el) {
        int res = -1;
        for (int i = 0; i < data.length; i++) {
            if (data[i] == el) {
                res = i;
                break;
            }

        }
        return res;
    }

    public static void main(String[] args) {
        int[] data =  {1, 2, 3, 4, 5};
        int res = FindLoop.indexOf(data, 5);
        System.out.println(res);

    }
}
