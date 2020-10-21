package array;

public class SoftSelected {
    public static int[] soft(int[]data) {
        for (int i = 0; i < data.length; i++) {
            int min = MinDiaposon.findMin(data, i, data.length - 1);
            int indexMin = FindLoop.indexOf(data, min, i, data.length - 1);
            int temp = data[i];
            data[i] = data[indexMin];
            data[indexMin] = temp;
        }
        return data;
    }

/*public class SoftSelected {
    public static int[] soft(int[] data) {
        for (int i = data.length-1; i >0; i--) {
            for (int j = 0; j < i; j++) {
                if (data[j] > data[j + 1]) {
                    int temp = data[j];
                    data[j] = data[j + 1];
                    data[j + 1] = temp;
                }
            }
        }
        return data;
    }*/


 /*   public static void main(String[] args) {
        int[] data = new int[]{2, 1, 3, 6, 5, 4};
        int[] res = soft(data);
        for (int i = 0; i < data.length; i++) {
        System.out.print(res[i] + " ");
        }
    }*/

}
