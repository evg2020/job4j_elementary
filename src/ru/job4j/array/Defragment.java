package ru.job4j.array;
// код, который будет перемещать заполненные ячейки массива в начало, а пустые в конец.
// метод пузырька

public class Defragment {
    public static String[] compress(String[] array) {
        for (int i =  array.length-1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (array[j] == null)  {
                    String temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
        return array;
    }

    public static void main(String[] args) {
        String[] array = {"I", null, "wanna", null, "be", null, "compressed", null};
        String[] res = compress(array);
        for (int i = 0; i < array.length; i++) {
            System.out.print(res[i] + " ");
        }
    }
}
