package array;
//Метод принимает два массива символов. В цикле for вам нужно сравнить значения ячеек с одинаковым индексом. Если все ячейки из массива pref соответствуют таким же ячейкам в массиве word, значит, нужно вернуть true.
public class ArrayChar {
    public static boolean startsWith(char[] word, char[] pref) {
        boolean result = true;
        for (int i = 0; i < pref.length; i++) {
            if (word[i] != pref[i]) {
                    result = false;
                    break;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        char[] word = {'H', 'e', 'l', 'l', 'o'};
        char[] pref = {'H', 'e'};
        boolean result = ArrayChar.startsWith(word, pref);
        System.out.println(result);
    }
}
