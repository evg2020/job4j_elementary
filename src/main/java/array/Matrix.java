package array;
// таблица умножений
public class Matrix {
    public static int[][] multiple(int size) {
        int[][] multiTable = new int[size][size];
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                multiTable[i][j] = (i + 1) * (j + 1);
            }
        }
        return multiTable;
    }

    public static void main(String[] args) {
        int size = 9;
        int[][] result = multiple(size);
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                  System.out.print(result[i][j] + " ");
                }
            System.out.println();
        }
    }
}


