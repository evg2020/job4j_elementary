package array;
//од, который будет перемещать заполненные ячейки массива в начало, а пустые в конец.
// метод заполнения
public class Defragment2 {
    public static String[] compress(String[] array) {
        for (int i = 0; i < array.length; i++) {
                int indexNull = indexNull(array);
                    String temp = array[i];
                    array[i] = array[indexNull];
                    array[indexNull] = temp;
            for (int j = 0; j < array.length; j++) {
            };
        }
        return array;
    }

    public static int indexNull(String[] array) {
        int res = -1;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == null) {
                res = i;
               System.out.print(" "+res);
                break;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        String[] array = {"I", null, "wanna", "compressed", "be", "compressed", "compressed"};
        String[] res = compress(array);
        for (int i = 0; i < array.length; i++) {
            System.out.print(" "+res[i] + " ");
        }
    }

}
