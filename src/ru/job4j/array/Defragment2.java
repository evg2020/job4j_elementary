package ru.job4j.array;
//од, который будет перемещать заполненные ячейки массива в начало, а пустые в конец.
// метод заполнения
public class Defragment2 {
    public static String[] compress(String[] array) {
        for (int i = 0; i < array.length; i++) {
            String rowNull = rowNull(array);
            int indexNull = indexNull(array);
                String temp = array[i];
                array[i] = array[indexNull];
                array[indexNull] = temp;

        }
        return array;
    }


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

    public static void main(String[] args) {
        String[] array = {"I", null, "wanna", null, "be", null, "compressed", null};
        String[] res = compress(array);
        for (int i = 0; i < array.length; i++) {
            System.out.print(res[i] + " ");
        }
    }

}
