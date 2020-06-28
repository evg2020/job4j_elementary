package ru.job4j.array;
//6.5. Поиск индекса в диапазоне. [#299131]
public class FindLoop {
    public static int indexOf(int[] data, int el, int start, int finish) {
        int res = -1;
        for (int i = start; i <= finish; i++) {
            if (data[i] == el) {
                res = i;
                break;
            }
        }
        return res;
    }

    //Поиск числа  и определение его индекса
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
        int res = FindLoop.indexOf(data, 4, 0, 4);
        System.out.println(res);

    }
}
