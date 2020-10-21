package array;

public class Square {
    public static int[] calc(int bound) {
        int[] res = new int[bound];
        for (int i = 0; i < res.length; i++) {
            res[i] = i * i;
        }
        return res;
    }

    public static void main(String[] args) {
        int[] array = calc(5);
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
}



